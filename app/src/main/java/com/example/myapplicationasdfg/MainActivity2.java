package com.example.myapplicationasdfg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button but1;
    Button but2;
    Button but3;
    Button but4;
    Button but5;
    Button but6;
    Button but7;
    Button but8;
    Button but9;
    boolean hod = true;
    String winner = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        but1 = findViewById(R.id.bu1);
        but2 = findViewById(R.id.bu2);
        but3 = findViewById(R.id.bu3);
        but4 = findViewById(R.id.bu4);
        but5 = findViewById(R.id.bu5);
        but6 = findViewById(R.id.bu6);
        but7 = findViewById(R.id.bu7);
        but8 = findViewById(R.id.bu8);
        but9 = findViewById(R.id.bu9);
        clear();

    }

    public void win()
    {
        if(but1.getText() == but2.getText() && but2.getText() == but3.getText())
        {
            winner = but1.getText().toString();
            go3(winner);
        }
        else if(but4.getText() == but5.getText() && but5.getText() == but6.getText())
        {
            winner = but4.getText().toString();
            go3(winner);
        }
        else if(but7.getText() == but8.getText() && but8.getText() == but9.getText())
        {
            winner = but7.getText().toString();
            go3(winner);
        }
        else if(but1.getText() == but4.getText() && but4.getText() == but7.getText())
        {
            winner = but1.getText().toString();
            go3(winner);
        }
        else if(but2.getText() == but5.getText() && but5.getText() == but8.getText())
        {
            winner = but2.getText().toString();
            go3(winner);
        }
        else if(but3.getText() == but6.getText() && but6.getText() == but9.getText())
        {
            winner = but3.getText().toString();
            go3(winner);
        }
        else if(but1.getText() == but5.getText() && but5.getText() == but9.getText())
        {
            winner = but1.getText().toString();
            go3(winner);
        }
        else if(but3.getText() == but5.getText() && but5.getText() == but7.getText() )
        {
            winner = but3.getText().toString();
            go3(winner);
        }
        else if (!(but1.getText().toString().isEmpty() || but2.getText().toString().isEmpty() || but3.getText().toString().isEmpty() || but4.getText().toString().isEmpty() || but5.getText().toString().isEmpty() || but6.getText().toString().isEmpty() || but7.getText().toString().isEmpty() || but8.getText().toString().isEmpty() || but9.getText().toString().isEmpty()))
        {
            winner = "Nichya";
            go3(winner);
        }
    }
    public void go3(String win)
    {
        if(!winner.equals("")) {
            Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
            intent1.putExtra("w", win);
            startActivity(intent1);
        }
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bu1:
                if(hod) {
                    but1.setText("X");
                    hod = false;
                }
                else {
                    but1.setText("0");
                    hod = true;
                }
                win();
                but1.setEnabled(false);
                break;
            case R.id.bu2:
                if(hod) {
                    but2.setText("X");
                    hod = false;
                }
                else {
                    but2.setText("0");
                    hod = true;
                }
                but2.setEnabled(false);
                win();
                break;
            case R.id.bu3:
                if(hod) {
                    but3.setText("X");
                    hod = false;
                }
                else {
                    but3.setText("0");
                    hod = true;
                }
                win();
                but3.setEnabled(false);
                break;
            case R.id.bu4:
                if(hod) {
                    but4.setText("X");
                    hod = false;
                }
                else {
                    but4.setText("0");
                    hod = true;
                }
                win();
                but4.setEnabled(false);
                break;
            case R.id.bu5:
                if(hod) {
                    but5.setText("X");
                    hod = false;
                }
                else {
                    but5.setText("0");
                    hod = true;
                }
                win();
                but5.setEnabled(false);
                break;
            case R.id.bu6:
                if(hod) {
                    but6.setText("X");
                    hod = false;
                }
                else {
                    but6.setText("0");
                    hod = true;
                }
                win();
                but6.setEnabled(false);
                break;
            case R.id.bu7:
                if(hod) {
                    but7.setText("X");
                    hod = false;
                }
                else {
                    but7.setText("0");
                    hod = true;
                }
                win();
                but7.setEnabled(false);
                break;
            case R.id.bu8:
                if(hod) {
                    but8.setText("X");
                    hod = false;
                }
                else {
                    but8.setText("0");
                    hod = true;
                }
                win();
                but8.setEnabled(false);
                break;
            case R.id.bu9:
                if(hod) {
                    but9.setText("X");
                    hod = false;
                }
                else {
                    but9.setText("0");
                    hod = true;
                }
                win();
                but9.setEnabled(false);
                break;
        }
    }
    public void clear()
    {
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
        but5.setText("");
        but6.setText("");
        but7.setText("");
        but8.setText("");
        but9.setText("");
    }
}