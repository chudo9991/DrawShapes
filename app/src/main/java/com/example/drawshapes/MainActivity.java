package com.example.drawshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyView myView = findViewById(R.id.myView);
        Button undoBtn = findViewById(R.id.buttonUndo);
        RadioGroup selectFigure = findViewById(R.id.buttonFigure);

        class Listener implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

            @Override
            public void onClick(View v) {
                myView.undo();
            }

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.i("onclick", "dfddfdf");
            }
        }
        
        //RadioGroup.setOnCheckedChangeListener;
//        AdapterView.OnItemSelectedListener;
//        AdapterView.OnItemClickListener  ???
//        String[] colors = getResources().getStringArray(R.array.colours);
//        вернет массив строк - цвета

        undoBtn.setOnClickListener(new Listener());
        selectFigure.setOnCheckedChangeListener(new Listener());

    }

    @Override
    public void onClick(View v) {
        Log.i("onClick", "onClick()");
    }
}