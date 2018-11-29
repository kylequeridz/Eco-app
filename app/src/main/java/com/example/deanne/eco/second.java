package com.example.deanne.eco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class second extends AppCompatActivity {

    Button button1;
    TextView chall;

    Random r;

    String[] items = {"conserve water", "plant trees", "use eco bag", "start a garden",
            "take a hike", "ride bike to work", "environmental charity",
            "recycle", "eat less meat", "donate items", "take shorter showers",
            "unplug everything", "stop using plastic", "grow your own food",
            "use metal straw","don't waste food", "use LED light bulbs", "take public transpo",
            "buy smart", "pick up garbage", "paper before plastic", "beach clean up",
            "segregate garbage", "save electricity", "4Rs", "vegetarian day", };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = findViewById(R.id.button1);

        chall =  findViewById(R.id.chall);

        r = new Random();

        button1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chall.setText(items[r.nextInt(items.length)]);
                Toast toast = Toast.makeText(getApplicationContext(),"I challenge you!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL, 50,50);
                toast.show();
            }
        });
    }

    public void nextActivity(View v) {
        Intent i = new Intent(this,splash.class);
        startActivity(i);
    }
}
