package com.example.gebruiker.droning;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper extends SQLiteOpenHelper {
            public static final String DATABASE_NAME = "Droning.db";
            public static final String TABLE_NAME = "IncidentLog";
            public static final String COL_1 = "ID";
            public static final String COL_2 = "NaamStudent";
            public static final String COL_3 = "Datum";
            public static final String COL_4 = "IncidentTime";
            public static final String COL_5 = "Damage";
            public static final String COL_6 = "Details";
            public static final String COL_7 = "ActionTaken";
            public static final String COL_8 = "Notes";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, IncidentTime TEXT, Damage TEXT, Details TEXT, ActionTaken TEXT, Notes TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
}
