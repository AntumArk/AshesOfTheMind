package zinc.aotm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Toast;

public class TreeActivity extends AppCompatActivity {

    private static final String DEBUGTAG="ZN";
    MainSurfaceView mainSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainSurfaceView=new MainSurfaceView(this);
        setContentView(mainSurfaceView);
        Toast.makeText(this,"Started",Toast.LENGTH_SHORT).show();


    }


    @Override
    protected void onPause() {
        super.onPause();
        mainSurfaceView.onPauseMainSurfaceView();
      //  openGLView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mainSurfaceView.onResumeMainSurfaceView();
       // openGLView.onResume();
    }


}
