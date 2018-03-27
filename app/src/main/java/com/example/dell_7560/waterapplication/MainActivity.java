package com.example.dell_7560.waterapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.id_spinner1);

        ArrayAdapter<TextView> adapter =ArrayAdapter.createFromResource(this,R.array.);
        //setting the new text view to the array adapter

        spinner.setAdapter(adapter);
    }
}
