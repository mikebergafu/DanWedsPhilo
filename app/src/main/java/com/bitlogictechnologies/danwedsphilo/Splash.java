package com.bitlogictechnologies.danwedsphilo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {
    private Timer t;
    private int TimeCounter = 0;
    private ImageView iv_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_ui);
        rotator();
        autoScreenLoader();
    }



    //Timer automatically loads hymn plate after 5sec
    public void autoScreenLoader(){
        t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        // you can set it to a textView to show it to the user to see the time passing while he is writing
                        TimeCounter++;
                        loadScreen();
                    }
                });

            }
        }, 3000, 1000); // 1000 means start from 1 sec, and the second 1000 is do the loop each 1 sec.
    }


    //loads the hymn plate after 2 sec
    public void loadScreen(){
        if(TimeCounter > 0){
            Intent moth=new Intent();
            moth.setClassName(this.getPackageName(), this.getPackageName()+".Order");
            //moth.setClassName(this.getPackageName(), getLocalClassName());
            startActivity(moth);
            t.cancel();
            finish();
            System.exit(0);
        }
    }
    public void rotator(){
        RotateAnimation rotate = new RotateAnimation(0,360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        iv_logo= (ImageView) findViewById(R.id.iv_logo);
        rotate.setDuration(3000);
        rotate.setInterpolator(new LinearInterpolator());
        iv_logo.startAnimation(rotate);

    }
}
