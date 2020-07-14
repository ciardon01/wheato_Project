package com.example.wheato_try_10.BBDD;

import android.provider.BaseColumns;

import java.util.EmptyStackException;

public class Estructura_BBDD {

    private Estructura_BBDD(){}

    public static class FeedEntry implements BaseColumns {

        public static final String TABLE_NAME = "recypes";
        // public static final String COLUMN_ID = "id";
        // public static final String COLUMN_IMG_URI = "img_uri";
        public static final String COLUMN_TITULO = "titulo";
        public static final String COLUMN_DESCRIPCION = "descripcion";
        public static final String COLUMN_PROCESO = "proceso";
        public static final String COLUMN_TIEMPO = "tiempo";
        public static final String COLUMN_DIFICULTAD = "dificultad";
        public static final String COLUMN_CALIFICACION = "calificacion";

    }

   /* private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";*/

    public static final String SQL_CREATE_ENTRIE =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    FeedEntry.COLUMN_TITULO + " TEXT," +
                    FeedEntry.COLUMN_DESCRIPCION + " TEXT," +
                   // FeedEntry.COLUMN_IMG_URI + " TEXT," +
                    FeedEntry.COLUMN_PROCESO + " TEXT," +
                    FeedEntry.COLUMN_TIEMPO + " TEXT," +
                    FeedEntry.COLUMN_DIFICULTAD + " TEXT," +
                    FeedEntry.COLUMN_CALIFICACION + " TEXT)";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.TABLE_NAME;

}
