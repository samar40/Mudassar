package com.example.mudasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView setname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        setname=findViewById(R.id.sname);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        setname.setText(name);
    }
}