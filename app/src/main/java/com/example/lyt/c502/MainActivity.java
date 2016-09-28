package com.example.lyt.c502;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mRecyclerView=(RecyclerView)findViewById(R.id.recylerView);

        // 为提高性能，设置为条目大小为固定。
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        // mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager=new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.HORIZONTAL);

        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter
        String[] myDataset1={"小米Note","华为荣耀7","魅族MX5","锤子T1"};
        String[] myDataset2={"1999","1999","1999","2480"};
        String[] myDataset3={"高通骁龙 801，3GB RAM，16GB ROM","麒麟 935，3GB RAM，16GB ROM","联发科（MTK)Helio X10 Turbo，3GB RAM，32GB ROM","高通骁龙 801，2GB RAM，32GB ROM"};
        mAdapter = new MyAdapter(myDataset1,myDataset2,myDataset3);
        mRecyclerView.setAdapter(mAdapter);
    }

}
