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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Toast;

public class TreeActivity extends AppCompatActivity {

    private static final String DEBUGTAG="ZN";
   // MainSurfaceView mainSurfaceView;
    ImageButton rootButton;
    RelativeLayout rootVerticalLayout;
    LinearLayout rootHorizontalLayout;

    ImageButton nextButton;
    Button  choiseButton;
    HorizontalScrollView choiseRow;
    HorizontalScrollView addRow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // mainSurfaceView=new MainSurfaceView(this);
        //setContentView(mainSurfaceView);
        setContentView(R.layout.activity_blank);
        Toast.makeText(this,"Started",Toast.LENGTH_SHORT).show();
        rootHorizontalLayout=findViewById(R.id.horizontalList);

        rootVerticalLayout=findViewById(R.id.verticalList);
        rootButton=findViewById(R.id.addButton);
        rootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addButtonOnClickListener();
            }
        });

    }

    private void addButtonOnClickListener(){
        choiseRow=new HorizontalScrollView(this);
        choiseRow.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT

        ));
        addRow=new HorizontalScrollView(this);
        addRow.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        ));
        choiseButton=new Button(this);
        choiseButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        choiseButton.setText("Yes");
        nextButton=new ImageButton(this);
        nextButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));

        nextButton.setImageResource(R.mipmap.add_button);


        rootVerticalLayout.addView(choiseRow);
        rootVerticalLayout.addView(addRow)        ;
        choiseRow.addView(choiseButton);
        addRow.addView(nextButton);
    }
    @Override
    protected void onPause() {
        super.onPause();
      //  mainSurfaceView.onPauseMainSurfaceView();
      //  openGLView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   mainSurfaceView.onResumeMainSurfaceView();
       // openGLView.onResume();
    }


}
