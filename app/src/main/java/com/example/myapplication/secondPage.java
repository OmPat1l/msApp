package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.ui.home.HomeFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivitySecondPageBinding;

//import org.chromium.net.CronetEngine;

public class secondPage extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivitySecondPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        Intent intent = getIntent();
//        String myString = intent.getStringExtra("name");
//        Log.d("MyActivity", "myString: " + myString);
//
//         myTextView = findViewById(R.id.text_home);
//        myTextView.setText(myString);
//        CronetEngine.Builder myBuilder = new CronetEngine.Builder(context);
//        CronetEngine cronetEngine = myBuilder.build();








        super.onCreate(savedInstanceState);

        binding = ActivitySecondPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarSecondPage.toolbar);
//        binding.appBarSecondPage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second_page);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second_page, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second_page);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void getotp(View view) {
        Intent intent = new Intent(secondPage.this, otp.class);
//        intent.putExtra("name",myText);
        startActivity(intent);
    }
    public void openEvent(View view) {
        Intent intent = new Intent(secondPage.this, ScrollingActivity.class);

//        intent.putExtra("name",myText);
        startActivity(intent);
    }

}