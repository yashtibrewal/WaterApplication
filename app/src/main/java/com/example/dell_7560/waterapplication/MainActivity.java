package com.example.dell_7560.waterapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Intent intent;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);//save button
        button.setOnClickListener(this);//assigning onclick event
    }

    @Override
    public void onClick(View view) {
        intent=new Intent(MainActivity.this,DefaultPage.class);
        startActivity(intent);
    }
}
