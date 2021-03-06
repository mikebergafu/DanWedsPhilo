package com.bitlogictechnologies.danwedsphilo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

import Data.DataArray;
import Struct.ListAdapter;

/**
 * Created by Mike-berg on 20-07-2017.
 */

public class PhotoShoot extends AppCompatActivity {
    DataArray dataArray;
    ListAdapter listAdapter;
    ListView lv_order;
    ArrayList<String> photo_list;
    TextView tv_title_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_ui);
        load_photo_order();

        tv_title_text=(TextView)findViewById(R.id.tv_title_text);
        tv_title_text.setText("\tPhoto Shoot");


        //Handles listview clicks
        lv_order.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }


        });
    }
    //get hymns from db and load them to listview
    public void load_photo_order(){
        dataArray=new DataArray();

        final String [] photo_string_array= dataArray.photo_order;
        photo_list=new ArrayList<String>(Arrays.asList(photo_string_array));

        listAdapter = new ListAdapter(this, photo_list);

        lv_order = (ListView) findViewById(R.id.lv_main);
        lv_order.setAdapter(listAdapter);
    }
    @Override
    public void onBackPressed() {
//Return to Main Hymn Page
        loadHome();

    }
    public void loadHome(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Order");
        startActivity(moth);
        System.exit(0);
    }

}
