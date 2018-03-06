package com.example.minerecyclerviewmodule.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LPF on 2018/3/5.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    LayoutInflater layoutInflater;
    private List<String> datas;

    public MyRecyclerAdapter(Context context, List<String> datas) {
        if (this.datas == null) {
            this.datas=new ArrayList<>();
        }
        this.layoutInflater = LayoutInflater.from(context);
        this.datas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        String s = datas.get(position);
        holder.tv.setText(s);

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    /**
     * @param position 这个代表从哪里开始添加
     */
    public void addData(int position,String data)
    {
        datas.add(position,data);
        notifyItemInserted(position);
    }

    /**
     * @param position 这个代表从哪里开始删除
     */
    public void removeData(int position)
    {
        datas.remove(position);
        notifyItemRemoved(position);
    }



    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public MyViewHolder(View view) {
            super(view);
            tv = view.findViewById(android.R.id.text1);
        }

    }

}
