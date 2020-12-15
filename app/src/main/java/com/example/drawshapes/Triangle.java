package com.example.drawshapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;

public class Triangle extends Shape {
    String color;
    PointF point1, point2, point3;

    public Triangle(String color, PointF point1, PointF point2, PointF point3) {
        super(color);

        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.color = color;
    }

    public void draw(Canvas canvas, Paint paint) {
        paint.setColor(Color.parseColor("#"+color));
        canvas.drawLine(this.point1.x, this.point1.y, this.point2.x, this.point2.y, paint);
        canvas.drawLine(this.point2.x, this.point2.y, this.point3.x, this.point3.y, paint);
        canvas.drawLine(this.point3.x, this.point3.y, this.point1.x, this.point1.y, paint);

    }
}
