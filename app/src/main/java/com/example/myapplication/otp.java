package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }
    public void getpass(View view) {
        Intent intent = new Intent(otp.this, MainActivityload.class);
//        intent.putExtra("name",myText);
        startActivity(intent);

    }
}