package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void loginUser(View view) {
        TextView myTextView = findViewById(R.id.editTextTextPersonName);
        String myText = myTextView.getText().toString();
        TextView myTextView1 = findViewById(R.id.editTextNumberPassword);
        String myText1 = myTextView1.getText().toString();
        if(myText1.equals("123") && myText.equals("ompatil")){
            Toast.makeText(this, "Button was pressed", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();

        }






    }
}