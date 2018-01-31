package zinc.aotm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

import zinc.aotm.Shapes.Triangle;

/**
 * Created by Linas on 2018-01-30.
 */

public class MainSurfaceView extends SurfaceView implements Runnable {

    private static final String DEBUGTAG="ZN";
    SurfaceHolder holder;
    Thread thread=null;
    volatile boolean running=false;
    Random random;
    private Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    volatile float touched_x=0;
    volatile float touched_y=0;
    volatile boolean touched=false;

    ArrayList<Triangle> triangles;

    public MainSurfaceView(Context context) {
        super(context);
        holder=getHolder();
        random=new Random();
        triangles=new ArrayList<>();
       /* for(int i=0;i<800;i+=50){
            int rot=180;
            for(int j=0;j<1000;j+=40){
                rot*=-1;
        triangles.add(new Triangle(i,j,
                50,
                rot,
                1,
                2,
                0xFFFFFFFF,
                0xFFFFFFFF));}}*/

    }
public void onResumeMainSurfaceView(){
        running=true;
        thread=new Thread(this);
        thread.start();
}
    public void onPauseMainSurfaceView(){
        running=false;
        boolean retry=true;
        while (retry){
            try {
                thread.join();
                retry=false;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        touched_x=event.getX();
        touched_y=event.getY();

        //Log.d(DEBUGTAG,"Number of triangles: "+triangles.size());
        int action=event.getAction();
        switch (action){
            case MotionEvent.ACTION_DOWN:
                touched=true;
                break;
            case MotionEvent.ACTION_MOVE:
                touched=true;
                break;
            case MotionEvent.ACTION_UP:
                touched=false;
                break;
            case MotionEvent.ACTION_CANCEL:
                touched=false;
                break;
            case MotionEvent.ACTION_OUTSIDE:
                touched=false;
                break;
                default:
        }
        return true;

    }


    @Override
    public void run() {
       while (running){
           if(holder.getSurface().isValid()){
               Canvas canvas=holder.lockCanvas();
                //This is where draw begins
               paint.setStyle(Paint.Style.FILL);
               paint.setColor(Color.BLACK);
               canvas.drawPaint(paint);
               paint.setStyle(Paint.Style.STROKE);
               paint.setStrokeWidth(3);

               int w=canvas.getWidth();
               int h=canvas.getHeight();

               paint.setStrokeWidth(5);
               paint.setColor(Color.WHITE);
               if(touched){


               canvas.drawRoundRect(50+touched_x,50+touched_y,200+touched_x,200+touched_y,20,20,paint);
               }

               paint.setTextSize(100);
               canvas.drawText("Hello?",touched_x,touched_y,paint);

               for(Triangle triangle:triangles)
                triangle.render(canvas);
               holder.unlockCanvasAndPost(canvas);

           }

       }
    }


}
