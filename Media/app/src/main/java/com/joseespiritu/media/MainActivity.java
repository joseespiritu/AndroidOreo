package com.joseespiritu.media;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean image1IsShowng = true;

    public void fade(View view) {
        Log.i("Info", "ImageView tapped");

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        if(image1IsShowng) {
            image1IsShowng = false;
            imageView1.animate().alpha(0).setDuration(2000);
            imageView2.animate().alpha(1).setDuration(2000);
        } else {
            image1IsShowng = true;
            imageView1.animate().alpha(1).setDuration(2000);
            imageView2.animate().alpha(0).setDuration(2000);
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}