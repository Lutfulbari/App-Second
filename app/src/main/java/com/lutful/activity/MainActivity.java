package com.lutful.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {


    ImageView image;
    Button bGone, bShow;
    LinearLayout mainLayout;
    Button bToast;
    TextView tvNextPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        bGone = findViewById(R.id.bGone);
        bShow = findViewById(R.id.bShow);
        mainLayout = findViewById(R.id.mainLayout);
        bToast = findViewById(R.id.bToast);
        tvNextPage = findViewById(R.id.tvNextPage);

        bShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setVisibility(View.VISIBLE);


            }
        });

        bGone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setVisibility(View.GONE);



            }
        });

        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                image.setVisibility(View.GONE);

                Toast.makeText(MainActivity.this, "Toast is Toast", Toast.LENGTH_LONG).show();

            }
        });

        tvNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);

                startActivity(myIntent);

            }
        });









    }
}