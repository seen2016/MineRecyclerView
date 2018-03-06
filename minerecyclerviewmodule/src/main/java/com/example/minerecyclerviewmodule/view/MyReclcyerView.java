package com.example.minerecyclerviewmodule.view;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by LPF on 2018/3/5.
 */

public class MyReclcyerView extends RecyclerView {
    public MyReclcyerView(Context context) {
        super(context);
    }

    public MyReclcyerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyReclcyerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAdapter(Adapter adapter) {
        super.setAdapter(adapter);
    }



}
