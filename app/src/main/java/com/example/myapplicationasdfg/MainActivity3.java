package com.example.myapplicationasdfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textpobeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle arguments = getIntent().getExtras();
        textpobeda = findViewById(R.id.txtwin);
        textpobeda.setText(arguments.get("w").toString());
    }
    public void goMenu(View v)
    {
        Intent intent1 = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent1);
    }
    public void Replay(View v)
    {
        Intent intent1 = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent1);
    }

}