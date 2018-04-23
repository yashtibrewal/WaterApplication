package com.example.dell_7560.waterapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class WaterPage extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.water_page);

        DataBaseHelper dataBaseHelper=new DataBaseHelper(this);
    }
}
