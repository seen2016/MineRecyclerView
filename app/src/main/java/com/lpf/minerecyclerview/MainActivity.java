package com.lpf.minerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.example.minerecyclerviewmodule.adapter.MyRecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecycler;
    private ArrayList<String> list;
    private MyRecyclerAdapter adapter;
    private String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myRecycler = (RecyclerView) findViewById(R.id.my_recycler);
        list = new ArrayList();
        for (int i = 0; i < 60; i++) {
            list.add("item"+i);
        }
        long round = Math.round(1.6);
        Log.e(TAG, "onCreate: "+round);

        adapter = new MyRecyclerAdapter(this,list);
//        myRecycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        myRecycler.setLayoutManager(new GridLayoutManager(this, 4));
        myRecycler.setAdapter(adapter);


    }
}
