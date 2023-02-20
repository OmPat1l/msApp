package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void loginUser(View view) {
        TextView myTextView = findViewById(R.id.editTextTextPersonName2);
        String myText = myTextView.getText().toString();
        TextView myTextView1 = findViewById(R.id.editTextNumberPassword2);
        String myText1 = myTextView1.getText().toString();
        if(myText1.equals("123") && myText.equals("lorem")){
            Intent intent = new Intent(MainActivity.this, secondPage.class);
            intent.putExtra("name",myText);
            startActivity(intent);
        }else{
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();

        }






    }



}