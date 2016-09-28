package com.example.lyt.c502;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by liyutong on 2016/9/28.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset1;
    private String[] mDataset2;
    private String[] mDataset3;
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.myview, parent, false);
        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public MyAdapter(String[] myDataset1,String[] myDataset2,String[] myDataset3) {
        mDataset1 = myDataset1;
        mDataset2 = myDataset2;
        mDataset3 = myDataset3;
    }


    //替换视图内容
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.mTextView1.setText(mDataset1[position]);
        holder.mTextView2.setText(mDataset2[position]);
        holder.mTextView3.setText(mDataset3[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset1.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;
        public TextView mTextView3;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextView1 =(TextView) itemView.findViewById(R.id.textView2);
            mTextView2 =(TextView) itemView.findViewById(R.id.textView3);
            mTextView3 =(TextView) itemView.findViewById(R.id.textView4);
        }
    }
}

