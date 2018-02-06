package zinc.aotm;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.List;

import Databases.BlockLink;

/**
 * Created by Linas on 2018-02-06.
 */

class HorizontalViewAdapter extends RecyclerView.Adapter<HorizontalViewAdapter.mViewHolder>{

    private List<BlockLink> linkList;



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public  class mViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView linkID;
        public Button button1,button2,button3;
        public ToggleButton addLinkButton;
        public mViewHolder(View v) {
            super(v);
            linkID=v.findViewById(R.id.textView_LinkID);
            addLinkButton=v.findViewById(R.id.toggleButton);
            button1=v.findViewById(R.id.button);
            button2=v.findViewById(R.id.button2);
            button3=v.findViewById(R.id.button3);
    }
    }

    public HorizontalViewAdapter(List<BlockLink> linkList) {
        this.linkList = linkList;
    }


    @Override
    public mViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView=LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.add_row,parent,false);
        return new mViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(mViewHolder holder, int position) {
      BlockLink blockLink=  linkList.get(position);
//      holder.linkID.setText(blockLink.getId());

    }

    @Override
    public int getItemCount() {
        return linkList.size();
    }

}
