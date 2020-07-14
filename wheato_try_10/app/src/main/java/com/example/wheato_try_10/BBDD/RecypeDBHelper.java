package com.example.wheato_try_10.BBDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class RecypeDBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "recypelist.db";

    public RecypeDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Estructura_BBDD.SQL_CREATE_ENTRIE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(Estructura_BBDD.SQL_DELETE_ENTRIES);
        onCreate(db);

    }

    //RecypeDBHelper dbHelper = new RecypeDBHelper(getContext());

}
