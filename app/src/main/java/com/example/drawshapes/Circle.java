package com.example.drawshapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

public class Circle extends Shape{
    String color;
    PointF point1, point2;
    Float radius;


    public Circle(String color, PointF point1, PointF point2) {
        super(color);

        this.point1 = point1;
        this.point2 = point2;

        radius = (float) Math.sqrt(Math.pow((point1.x-point2.x),2)+Math.pow((point1.y-point2.y),2));
    }

    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.parseColor("#"+color));
        canvas.drawCircle(this.point1.x, this.point1.y, radius, paint);

    }
}
