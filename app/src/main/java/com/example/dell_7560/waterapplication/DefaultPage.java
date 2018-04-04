package com.example.dell_7560.waterapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DefaultPage extends AppCompatActivity implements View.OnClickListener{
    ImageButton imageButton_Water,imageButton_Reminder,imageButton_Analysis,imageButton_Myinfo;
    Intent intent;
    TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create a database reference
        //query for the name
        //store the query in a variable


        //setting the xml view
        setContentView(R.layout.defaut_page);
        //linking the buttons from xml to java
        imageButton_Analysis=findViewById(R.id.id_analysis);
        imageButton_Myinfo=findViewById(R.id.id_myinfo);
        imageButton_Reminder=findViewById(R.id.id_reminder);
        imageButton_Water=findViewById(R.id.id_waterConsumption);

        //assigning on click listeners
        imageButton_Analysis.setOnClickListener(this);
        imageButton_Water.setOnClickListener(this);
        imageButton_Reminder.setOnClickListener(this);
        imageButton_Myinfo.setOnClickListener(this);

        //linking text views
        welcomeMessage=findViewById(R.id.id_welcome);



        //assign the name to text view
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {//checking the id for the image button clicked
            case R.id.id_analysis:
                //creating intents for the respective classes
                intent=new Intent(this,Report.class);
                Toast.makeText(DefaultPage.this,
                        "Analysis!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.id_myinfo:
                intent=new Intent(this,MyInformation.class);
                Toast.makeText(DefaultPage.this,
                        "My Information!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.id_reminder:
                intent =new Intent(this,Reminder.class);
                Toast.makeText(DefaultPage.this,
                        "Reminder!", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.id_waterConsumption:
                intent=new Intent(this,WaterPage.class);
                Toast.makeText(DefaultPage.this,
                        "Water Consumption", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;

        }
    }
}
