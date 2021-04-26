package com.example.mudasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    ListView L1;
    String Name[]={"Pakistan","India","UAE","Amarica","Farance","Rassia","A","B","C","D","E"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);




        L1 = findViewById(R.id.allcont);
        myadapter adapter = new myadapter(this, Name);
        L1.setAdapter(adapter);

        L1.setOnItemClickListener((parent, view, position, id) -> {
            String s = L1.getItemAtPosition(position).toString();
            Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this,NextActivity.class);
            intent.putExtra("Name",s);
            startActivity(intent);
        });



    }
}