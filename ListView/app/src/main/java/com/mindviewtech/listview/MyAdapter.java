package com.mindviewtech.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by User on 11/30/2017.
 */

public class MyAdapter extends BaseAdapter {
    Context mContext;
    String[] names;
   int[] images;

    public MyAdapter(MainActivity mainActivity, String[] names, int[] images) {
        this.mContext=mainActivity;
        this.names=names;
        this.images=images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.activity_adapter,null);

        TextView textView=(TextView)view.findViewById(R.id.textview);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageview);
        textView.setText(names[position]);
        //Glide.with(mContext).load(images[position]).into(imageView);
        imageView.setImageResource(images[position]);

        return view;
    }
}
