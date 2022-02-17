package com.moochiking.menumultipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button firstActivityButton , secondActivityButton  , thirdActivityButton , exitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstActivityButton = (Button) findViewById(R.id.firstActBtn);
        secondActivityButton = (Button) findViewById(R.id.secondActBtn);
        thirdActivityButton = (Button) findViewById(R.id.thirdActBtn);
        exitButton = (Button) findViewById(R.id.exitBtn);

        firstActivityButton.setOnClickListener(this);
        secondActivityButton.setOnClickListener(this);
        thirdActivityButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();

        if(id == R.id.firstActBtn){
            Intent firstActivity = new Intent(this , FirstActivity.class);
            startActivity(firstActivity);
        }
        else if (id == R.id.secondActBtn){
            Intent secondActivity = new Intent(this , SecondActivity.class);
            startActivity(secondActivity);
        }
        else if (id == R.id.thirdActBtn){
            Intent thirdActivity = new Intent(this , ThirdActivity.class);
            startActivity(thirdActivity);
        }
        else if (id == R.id.exitBtn){
            finish();
        }
    }
}