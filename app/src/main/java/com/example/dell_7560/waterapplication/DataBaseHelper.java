package com.example.dell_7560.waterapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper{
    public final static String databaseName="WaterApplication.db";

    public final static String tableName_1="WaterBase";
    public final static String columnName_1_1="Name";

    public final static String tableName_2="Consumption";
    public final static String columnName_2_1="Date";
    public final static String columnName_2_2="Time";
    public final static String columnName_2_3="Glasses";

    DataBaseHelper(Context context) {
        super(context, databaseName , null, 1);
        SQLiteDatabase db= this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "
                            +tableName_2+"( "
                            +columnName_2_1+" varchar(8) PRIMARY KEY NOT NULL, "
                            +columnName_2_2+" double(5,2) , "
                            +columnName_2_3+" INT );");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE "+tableName_2+";");
        onCreate(sqLiteDatabase);
    }
}
