package com.example.my_calci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash_clc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_clc);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();

                } finally {
                    Intent intent =new Intent(splash_clc.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
}