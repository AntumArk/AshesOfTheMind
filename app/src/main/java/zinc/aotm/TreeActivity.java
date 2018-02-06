package zinc.aotm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import Databases.BlockLink;

public class TreeActivity extends AppCompatActivity {
    private static final String DEBUGTAG="ZN";

    //Data preparation
    private int count=0;
    private List<BlockLink> linkList=new ArrayList<>();


   //List preparation
    RecyclerView horizontalView;
    HorizontalViewAdapter horizontalViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_blank);


        horizontalView =findViewById(R.id.horizontalList);

        // specify an adapter (see also next example)
        horizontalViewAdapter = new HorizontalViewAdapter(linkList);

        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        // use a linear layout manager
        horizontalView.setLayoutManager(mLayoutManager);
        horizontalView.setItemAnimator(new DefaultItemAnimator());
        horizontalView.setAdapter(horizontalViewAdapter);


        Button button=findViewById(R.id.add_item_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            linkList.add(new BlockLink(count,"Random",50,count-1,count+1));
            count++;
            horizontalViewAdapter.notifyDataSetChanged();
            }
        });
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
