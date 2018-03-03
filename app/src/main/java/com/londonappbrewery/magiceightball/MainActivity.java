package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnAsk;
    private ImageView imgResult;
    private Random mRandom;

    private int resourcemx[] = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise all components here
        btnAsk = findViewById(R.id.btnAsk);
        imgResult = findViewById(R.id.imgResult);
        mRandom = new Random();

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
            }
        });

        imgResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
            }
        });

    }

    private void getResult()
    {
        imgResult.setImageResource(resourcemx[mRandom.nextInt(5)]);
    }
}
