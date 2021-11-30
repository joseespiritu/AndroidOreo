package com.joseespiritu.media;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {
        Log.i("Info", "ImageView tapped");

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);

        //imageView1.animate().translationXBy(-1000).setDuration(2000);
        //imageView1.animate().rotation(1800).alpha(0).setDuration(1000);
        imageView1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setX(-1000);
        imageView1.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}