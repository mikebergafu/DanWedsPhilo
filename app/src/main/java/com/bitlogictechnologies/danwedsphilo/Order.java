package com.bitlogictechnologies.danwedsphilo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import Data.DataArray;
import Struct.ListAdapter;

/**
 * Created by Mike-berg on 18-07-2017.
 */

public class Order extends AppCompatActivity {
    private int exitCount=0;
    DataArray dataArray;
    ListAdapter listAdapter;
    ListView lv_order;
    ArrayList<String> programme_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_ui);
        load_programme_order();

        lv_order.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               switch (i){
                   case 0:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadScreen();
                       break;
                   case 1:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadServiceScreen();
                       break;
                   case 2:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadPhotoScreen();
                       break;
                   case 3:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadReceptionScreen();
                       break;
                   case 4:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadProtocolScreen();
                       break;
                   case 5:
                       Toast.makeText(getApplicationContext(), "This is "+ programme_list.get(i)+"'s, it has no links" , Toast.LENGTH_SHORT).show();
                       break;
                   case 6:
                       Toast.makeText(getApplicationContext(), "This is "+ programme_list.get(i)+"'s, it has no links" , Toast.LENGTH_SHORT).show();
                       break;
                   case 7:
                       Toast.makeText(getApplicationContext(), "This is "+ programme_list.get(i)+"'s, it has no links" , Toast.LENGTH_SHORT).show();
                       break;
                   case 8:
                       Toast.makeText(getApplicationContext(), "This is "+ programme_list.get(i)+"'s, it has no links" , Toast.LENGTH_SHORT).show();
                       break;
                   case 9:
                       Toast.makeText(getApplicationContext(), "This is "+ programme_list.get(i)+"'s, it has no links" , Toast.LENGTH_SHORT).show();

                       break;
                   case 10:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadHymn1Screen();
                       break;
                   case 11:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadHymn2Screen();
                       break;
                   case 12:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadAcknowScreen();
                       break;
                   case 13:
                       Toast.makeText(getApplicationContext(), "You Clicked "+ programme_list.get(i) , Toast.LENGTH_SHORT).show();
                       loadAppreciationScreen();
                       break;


               }

            }
        });
    }
    //get hymns from db and load them to listview
    public void load_programme_order(){
        dataArray=new DataArray();

        final String [] programme_string_array= dataArray.programme_order;
        programme_list=new ArrayList<String>(Arrays.asList(programme_string_array));

        listAdapter = new ListAdapter(this, programme_list);

        lv_order = (ListView) findViewById(R.id.lv_main);
        lv_order.setAdapter(listAdapter);
    }



    public void loadScreen(){
            Intent moth=new Intent();
            moth.setClassName(this.getPackageName(), this.getPackageName()+".Functions");
            startActivity(moth);
            System.exit(0);
    }

    public void loadServiceScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".ServiceOrder");
        startActivity(moth);
        System.exit(0);
    }
    public void loadPhotoScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".PhotoShoot");
        startActivity(moth);
        System.exit(0);
    }
    public void loadReceptionScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Reception");
        startActivity(moth);
        System.exit(0);
    }
    public void loadProtocolScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Protocol");
        startActivity(moth);
        System.exit(0);
    }
    public void loadHymn1Screen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Hymn");
        startActivity(moth);
        System.exit(0);
    }
    public void loadHymn2Screen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Hymn2");
        startActivity(moth);
        System.exit(0);
    }
    public void loadAcknowScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Acknow");
        startActivity(moth);
        System.exit(0);
    }

    public void loadAppreciationScreen(){
        Intent moth=new Intent();
        moth.setClassName(this.getPackageName(), this.getPackageName()+".Appre");
        startActivity(moth);
        System.exit(0);
    }

    @Override
    public void onBackPressed() {

        exitCount++;

        if (exitCount==1){
            Toast.makeText(this, "Press Again to Close App ",Toast.LENGTH_SHORT ).show();
        }
        else{
            finish();
            System.exit(0);
        }

    }


}
