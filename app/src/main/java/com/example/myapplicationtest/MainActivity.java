package com.example.myapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mytext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Activity created!\n", Toast.LENGTH_SHORT).show();
        mytext=findViewById(R.id.my_text);
        mytext.append("Activity created!\n");
        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Click!\n", Toast.LENGTH_SHORT).show();
                mytext.append("Click!\n");
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Activity stopped!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Activity stopped!\n");
    };
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Activity started!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Activity started!\n");
    };
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Activity resumed!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Activity resumed!\n");
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Activity destroyed!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Activity destroyed!\n");
    };
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Saved instance state!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Saved instance state!\n");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Activity paused!\n", Toast.LENGTH_SHORT).show();
        mytext.append("Activity paused!\n");
    }

}