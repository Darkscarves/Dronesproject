package com.example.gebruiker.droning;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
            public static final String TABLE_NAME1 = "BatteryChargeLogs";
            public static final String COL_9 = "BatteryNo";
            public static final String COL_10 = "BatteryResidual";
            public static final String COL_11 = "ChargeDate";
            public static final String COL_12 = "ChargeInput";
            public static final String COL_13 = "FlightDuration";
            public static final String COL_14 = "PreFlight";
            public static final String TABLE_NAME2 = "MaintenanceLog";
            public static final String COL_15 = "Reason";
            public static final String COL_16 = "WorkDone";
            public static final String COL_17 = "PartsReplaced";
            public static final String COL_18 = "SystemTestedYes";
            public static final String COL_19 = "SystemTestedNo";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, IncidentTime TEXT, Damage TEXT, Details TEXT, ActionTaken TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME1 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, BatteryNo TEXT, BatteryResidual TEXT, ChargeDate TEXT, ChargeInput TEXT, FlightDuration TEXT, PreFlight TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME2 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Reason TEXT, WorkDone TEXT, PartsReplaced TEXT, SystemTested TEXT, Notes TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        onCreate(db);
    }

    public boolean insertDataIncident(String NaamStudent, String Datum, String IncidentTime, String Damage, String Details, String ActionTaken, String Notes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_4,IncidentTime);
        contentValues.put(COL_5,Damage);
        contentValues.put(COL_6,Details);
        contentValues.put(COL_7,ActionTaken);
        contentValues.put(COL_8,Notes);
        long result = db.insert(TABLE_NAME,null,contentValues);
            if (result == -1)
                return false;
            else
                return true;
    }

    public boolean insertDataBattery(String NaamStudent, String Datum, String BatteryNo, String BatteryResidual, String ChargeDate, String ChargeInput, String FlightDuration, String PreFlight, String Notes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_9,BatteryNo);
        contentValues.put(COL_10,BatteryResidual);
        contentValues.put(COL_11,ChargeDate);
        contentValues.put(COL_12,ChargeInput);
        contentValues.put(COL_13,FlightDuration);
        contentValues.put(COL_14,PreFlight);
        contentValues.put(COL_8,Notes);
        long result = db.insert(TABLE_NAME1,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public boolean insertDataMaintenance(String NaamStudent, String Datum, String Reason, String WorkDone, String PartsReplaced, String SystemTestedYes,String SystemTestedNo, String Notes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_15,Reason);
        contentValues.put(COL_16,WorkDone);
        contentValues.put(COL_17,PartsReplaced);
        contentValues.put(COL_18,SystemTestedYes);
        contentValues.put(COL_19,SystemTestedNo);
        contentValues.put(COL_8,Notes);
        long result = db.insert(TABLE_NAME2,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
