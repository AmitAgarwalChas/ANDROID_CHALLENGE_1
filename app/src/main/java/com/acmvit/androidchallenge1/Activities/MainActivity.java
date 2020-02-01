package com.acmvit.androidchallenge1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.acmvit.androidchallenge1.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actCall();
    }

    public void actCall(){

        Button amit = (Button)findViewById(R.id.btn_amit_agarwal);

        amit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AmitAgarwalActivity.class);
                startActivity(intent);

            }
        });

    }


}

