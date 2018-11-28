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
            public static final String TABLE_NAME3 = "FlightLog";
            public static final String COL_20 = "TakeOffTime";
            public static final String COL_21 = "LandingTime";
            public static final String COL_22 = "Duration";
            public static final String COL_23 = "Aircraft";
            public static final String COL_24 = "AircraftSystem";
            public static final String COL_25 = "Pilot";
            public static final String COL_26 = "Observer";
            public static final String COL_27 = "PayloadOperator";
            public static final String COL_28 = "Location";
            public static final String COL_29 = "FlightPurpose";
            public static final String COL_30 = "Comment";
            public static final String TABLE_NAME4 = "FlightLog";
            public static final String COL_31 = "TakeOffTime";
            public static final String COL_32 = "LandingTime";
            public static final String COL_33 = "Duration";
            public static final String COL_34 = "Aircraft";
            public static final String COL_35 = "AircraftSystem";
            public static final String COL_37 = "Pilot";
            public static final String COL_38 = "Observer";
            public static final String COL_39 = "PayloadOperator";
            public static final String COL_40 = "Location";
            public static final String COL_41 = "FlightPurpose";
            public static final String COL_42 = "Comment";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, IncidentTime TEXT, Damage TEXT, Details TEXT, ActionTaken TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME1 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, BatteryNo TEXT, BatteryResidual TEXT, ChargeDate TEXT, ChargeInput TEXT, FlightDuration TEXT, PreFlight TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME2 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Reason TEXT, WorkDone TEXT, PartsReplaced TEXT, SystemTested BOOLEAN, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME3 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, TakeOffTime TEXT, LandingTime TEXT, Duration TEXT, Aircraft TEXT, AircraftSystem TEXT, Pilot TEXT, Observer TEXT, PayloadOperator TEXT, Location TEXT, FlightPurpose TEXT, Comment TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
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

    public boolean insertDataMaintenance(String NaamStudent, String Datum, String Reason, String WorkDone, String PartsReplaced, String Notes){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_15,Reason);
        contentValues.put(COL_16,WorkDone);
        contentValues.put(COL_17,PartsReplaced);
        contentValues.put(COL_8,Notes);
        contentValues.put(COL_15,Notes);
        long result = db.insert(TABLE_NAME2,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertDataPreSiteSurvey(String NaamStudent, String Datum, String TakeOffTime, String LandingTime, String Duration, String Notes, String Aircraft, String AircraftSystem, String Pilot, String Observer, String PayloadOperator, String Location, String FlightPurpose, String Comment){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_20,TakeOffTime);
        contentValues.put(COL_21,LandingTime);
        contentValues.put(COL_22,Duration);
        contentValues.put(COL_23,Aircraft);
        contentValues.put(COL_24,AircraftSystem);
        contentValues.put(COL_25,Pilot);
        contentValues.put(COL_26,Observer);
        contentValues.put(COL_27,PayloadOperator);
        contentValues.put(COL_28,Location);
        contentValues.put(COL_29,FlightPurpose);
        contentValues.put(COL_30,Comment);
        contentValues.put(COL_8,Notes);
        long result = db.insert(TABLE_NAME3,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
