package com.example.count_stock;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class First_Layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__layout);
        if (Build.VERSION.SDK_INT>=21){
            getWindow().setStatusBarColor(this.getResources().getColor(R.color.colorPrimary));
        }

        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent = new Intent(First_Layout.this, Login_Layout.class);
                startActivity(intent);
                finish();
            }
        }, 2000);

    }
}
