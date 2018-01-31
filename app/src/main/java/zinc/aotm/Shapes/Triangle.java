package zinc.aotm.Shapes;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by Linas on 2018-01-31.
 */

public class Triangle {

    private float x;
    private float y;
    private float size;
    private float angle;
    private  float scale;
    private float strokeWidth;
    private  int strokeColor;
    private int fillColor;
    private  Paint paint;

    public Triangle(float x, float y, float size, float angle, float scale, float strokeWidth, int strokeColor, int fillColor) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.angle = angle;
        this.scale = scale;
        this.strokeWidth = strokeWidth;
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public float getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(float strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(int strokeColor) {
        this.strokeColor = strokeColor;
    }

    public int getFillColor() {
        return fillColor;
    }

    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }




    public void render(Canvas canvas)
    {
        float h=(float)Math.sqrt(Math.pow(size,2)-Math.pow(size/2,2));
        float o=h/3;
        canvas.save();
        canvas.translate(x,y);
        canvas.rotate(angle);
        canvas.scale(scale,scale);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(fillColor);

        canvas.drawLine(-size/2 ,o,size/2,o,paint);
        canvas.drawLine(size/2,o,0,-2*o,paint);
        canvas.drawLine(0,-2*o,-size/2 ,o,paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(strokeColor);
        paint.setStrokeWidth(strokeWidth);
        canvas.drawLine(-size/2 ,o,size/2,o,paint);
        canvas.drawLine(size/2,o,0,-2*o,paint);
        canvas.drawLine(0,-2*o,-size/2 ,o,paint);
        canvas.restore();
    }



}
