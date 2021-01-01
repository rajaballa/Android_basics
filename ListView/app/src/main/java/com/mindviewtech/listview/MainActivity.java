package com.mindviewtech.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    GridView lv;
    String[] names={"Anji","Venkat","Bannana","Married","Search","Arun","Mahesh"};
    int[] images={R.drawable.image1,R.drawable.image2,R.drawable.images,R.drawable.images7,R.drawable.images34,R.drawable.pha,R.drawable.pharmacy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(GridView) findViewById(R.id.list);

        MyAdapter adapter=new MyAdapter(MainActivity.this,names,images);
        lv.setAdapter(adapter);
    }
}
