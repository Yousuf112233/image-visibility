package com.example.imagevisibility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    Button visibility_show;
    Button visibility_Gon;
    Button btoast;
    TextView nextpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1=findViewById(R.id.image1);
        visibility_show=findViewById(R.id.visibility_show);
        visibility_Gon=findViewById(R.id.visibility_Gon);
        btoast=findViewById(R.id.btoast);
        nextpage =findViewById(R.id.nextpage);


     visibility_show.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             image1.setVisibility(View.VISIBLE);
         }
     });


     visibility_Gon.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             image1.setVisibility(View.GONE);
         }
     });



        btoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"i love allah",Toast.LENGTH_LONG).show();
            }
        });

        nextpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent =new Intent(MainActivity.this, SecondActivity.class);

             startActivity(myIntent);




            }
        });





    }
}