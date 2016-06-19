package com.huttcross.registration;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import java.sql.Date;

/**
 * Created by Calum Chamberlain on 19/06/2016.
 */
public class RegisteredRiders extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="SignedOn";

    public RegisteredRiders(Context context) {
        super(context, DATABASE_NAME, null, 1)
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL("CREATE TABLE racers (_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "firstname TEXT, surname TEXT, datofbirth DATE, emergencyname TEXT, " +
                "emergencyphonenumber INTEGER, racenumber INTEGER, grade TEXT);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS friends");
        onCreate(db);
    }

    public void addRacer(String firstname, String surname, Date dateofbirth, String emergencyname,
                         Integer emergencyphonenumber, Integer racenumber, String grade) {
        ContentValues values=new ContentValues(7);
        values.put("firstname", firstname);
        values.put("surname", surname);
        values.put("dateofbirth", dateofbirth);
        values.put("emergencyname", emergencyname);
        values.put("emergencyphonenumber", emergencyphonenumber);
        values.put("racenumber", racenumber);
        values.put("grade", grade);

        getWritableDatabase().insert("racers", "firstname", values)
    }
}
