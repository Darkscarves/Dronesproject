package com.example.gebruiker.droning;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Path;
import android.view.View;

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
            public static final String TABLE_NAME4 = "ArrivalChecklist";
            public static final String COL_31 = "SiteSurvey";
            public static final String COL_32 = "FlightPlan";
            public static final String COL_33 = "Airframe";
            public static final String COL_34 = "Camera";
            public static final String COL_35 = "Connections";
            public static final String COL_36 = "Propellers";
            public static final String COL_37 = "CalibrationPlatform";
            public static final String COL_38 = "GroundStation";
            public static final String COL_39 = "Monitor";
            public static final String COL_40 = "CrewIdBadges";
            public static final String COL_41 = "HardHat";
            public static final String COL_42 = "Radio";
            public static final String COL_43 = "FirstAid";
            public static final String COL_44 = "Extinguisher";
            public static final String COL_45 = "Signs";
            public static final String TABLE_NAME5 = "PreFlightChecklist";
            public static final String COL_46 = "FlightBattery";
            public static final String COL_47 = "Transmitters";
            public static final String COL_48 = "SelfDiagnostic";
            public static final String COL_49 = "MonitorCalibration";
            public static final String COL_50 = "SaveCalibration";
            public static final String COL_51 = "TelemetryLink";
            public static final String COL_52 = "StartRecording";
            public static final String COL_53 = "AircraftAlignment";
            public static final String COL_54 = "Crew";
            public static final String COL_55 = "Clearance";
            public static final String COL_56 = "PowerUp";
            public static final String COL_57 = "TakeOff";
            public static final String COL_58 = "Communication";
            public static final String COL_59 = "Landing";
            public static final String TABLE_NAME6 = "OnSiteSurvey";
            public static final String COL_60 = "Pilot";
            public static final String COL_61 = "WindSpeed";
            public static final String COL_62 = "Direction";
            public static final String COL_63 = "Obstruction";
            public static final String COL_64 = "ViewLimitations";
            public static final String COL_65 = "People";
            public static final String COL_66 = "Livestock";
            public static final String COL_67 = "Temperature";
            public static final String COL_68 = "Visibility";
            public static final String COL_69 = "Surface";
            public static final String COL_70 = "Permission";
            public static final String COL_71 = "Public";
            public static final String COL_72 = "AirTraffic";
            public static final String COL_73 = "Proximity";
            public static final String COL_74 = "TakeOffArea";
            public static final String COL_75 = "LandingArea";
            public static final String COL_76 = "OperationalZone";
            public static final String COL_77 = "EmergencyArea";
            public static final String COL_78 = "HoldingArea";
            public static final String TABLE_NAME7 = "PreSiteSurvey";
            public static final String COL_79 = "Latitude";
            public static final String COL_80 = "Altitude";
            public static final String COL_81 = "WorkRequired";
            public static final String COL_82 = "DateWorkRequired";
            public static final String COL_83 = "DownloadedToGround";
            public static final String COL_84 = "VehicularAcces";
            public static final String COL_85 = "Pilot";
            public static final String COL_86 = "Observer";
            public static final String COL_87 = "UAVRegistration";
            public static final String COL_88 = "Helper1";
            public static final String COL_89 = "Helper2";
            public static final String COL_90 = "Airspace";
            public static final String COL_91 = "Terrain";
            public static final String COL_92 = "Proximities";
            public static final String COL_93 = "Hazards";
            public static final String COL_94 = "Restrictions";
            public static final String COL_95 = "Sensitivities";
            public static final String COL_96 = "People";
            public static final String COL_97 = "Livestock";
            public static final String COL_98 = "Permission";
            public static final String COL_99 = "Acces";
            public static final String COL_100 = "Footpaths";
            public static final String COL_101 = "Alternate";
            public static final String COL_102 = "RiskReduction";
            public static final String COL_103 = "Weather";
            public static final String COL_104 = "NOTAMS";
            public static final String COL_105 = "LocalAirTraffic";
            public static final String COL_106 = "RegionalAirTraffic";
            public static final String COL_107 = "MilitaryControl";
            public static final String COL_108 = "NoticeToAirmen";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, IncidentTime TEXT, Damage TEXT, Details TEXT, ActionTaken TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME1 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, BatteryNo TEXT, BatteryResidual TEXT, ChargeDate TEXT, ChargeInput TEXT, FlightDuration TEXT, PreFlight TEXT, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME2 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Reason TEXT, WorkDone TEXT, PartsReplaced TEXT, SystemTested BOOLEAN, Notes TEXT )");
        db.execSQL("create table " + TABLE_NAME3 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, TakeOffTime TEXT, LandingTime TEXT, Duration TEXT, Aircraft TEXT, AircraftSystem TEXT, Pilot TEXT, Observer TEXT, PayloadOperator TEXT, Location TEXT, FlightPurpose TEXT, Comment TEXT )");
        db.execSQL("create table " + TABLE_NAME4 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, SiteSurvey BOOLEAN, FlightPlan BOOLEAN, Airframe BOOLEAN, Camera BOOLEAN, Connections BOOLEAN, Propellers BOOLEAN, CalibrationPlatform BOOLEAN, GroundStation BOOLEAN, Monitor BOOLEAN, CrewIdBadges BOOLEAN, HardHat BOOLEAN, Radio BOOLEAN, FirstAid BOOLEAN, Extinguisher BOOLEAN, Signs BOOLEAN )");
        db.execSQL("create table " + TABLE_NAME5 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Airframe BOOLEAN, FlightBattery BOOLEAN, Transmitters BOOLEAN, Camera BOOLEAN, SelfDiagnostic BOOLEAN, MonitorCalibration BOOLEAN, SaveCalibration BOOLEAN, TelemetryLink BOOLEAN, StartRecording BOOLEAN, AircraftAlignment BOOLEAN, Crew BOOLEAN, Clearance BOOLEAN, PowerUp BOOLEAN, TakeOff BOOLEAN, Communication BOOLEAN, Landing BOOLEAN )");
        db.execSQL("create table " + TABLE_NAME6 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Pilot TEXT, Observer TEXT, WindSpeed TEXT, Direction TEXT, Obstruction TEXT, ViewLimitations TEXT, People TEXT, Livestock TEXT, Temperature TEXT, Visibility TEXT, Surface TEXT, Permission TEXT, Public TEXT, AirTraffic TEXT, Communication TEXT, Proximity TEXT, TakeOffArea TEXT, LandingArea TEXT, OperationalZone TEXT, EmergencyArea TEXT, HoldingArea TEXT )");
        db.execSQL("create table " + TABLE_NAME7 +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, NaamStudent TEXT, Datum DATE, Latitude TEXT, Altitude TEXT, WorkRequired TEXT, DateWorkRequired BOOLEAN, DownloadedToGround TEXT, VehicularAcces TEXT, Pilot TEXT, Observer TEXT, UAVRegistration TEXT, Helper1 TEXT, Helper2 TEXT, Airspace TEXT, Terrain TEXT, Proximities TEXT, Hazards TEXT, Restrictions TEXT, Sensitivities TEXT, People TEXT, Livestock TEXT, Permission TEXT, Acces TEXT, Footpaths TEXT, Alternate BOOLEAN, RiskReduction TEXT, Weather TEXT, NOTAMS TEXT, LocalAirTraffic TEXT, RegionalAirTraffic TEXT, MilitaryControl BOOLEAN, NoticeToAirmen TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME3);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME4);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME5);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME6);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME7);
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

    public boolean insertDataArrivalChecklist(String NaamStudent, String Datum, String SiteSurvey, String FlightPlan, String Airframe, String Camera, String Connections, String Propellers, String CalibrationPlatform, String GroundStation, String Monitor, String CrewIdBadges, String HardHat, String Radio, String FirstAid, String Extinguisher, String Signs){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_31,SiteSurvey);
        contentValues.put(COL_32,FlightPlan);
        contentValues.put(COL_33,Airframe);
        contentValues.put(COL_34,Camera);
        contentValues.put(COL_35,Connections);
        contentValues.put(COL_36,Propellers);
        contentValues.put(COL_37,CalibrationPlatform);
        contentValues.put(COL_38,GroundStation);
        contentValues.put(COL_39,Monitor);
        contentValues.put(COL_40,CrewIdBadges);
        contentValues.put(COL_41,HardHat);
        contentValues.put(COL_42,Radio);
        contentValues.put(COL_43,FirstAid);
        contentValues.put(COL_44,Extinguisher);
        contentValues.put(COL_45,Signs);
        long result = db.insert(TABLE_NAME4,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertDataPreFlightChecklist(String NaamStudent, String Datum, String Airframe, String FlightBattery, String Transmitters, String Camera, String SelfDiagnostic, String MonitorCalibration, String SaveCalibration, String TelemetryLink, String StartRecording, String AircraftAlignment, String Crew, String Clearance, String PowerUp, String TakeOff, String Communication, String Landing){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_33,Airframe);
        contentValues.put(COL_46,FlightBattery);
        contentValues.put(COL_47,Transmitters);
        contentValues.put(COL_34,Camera);
        contentValues.put(COL_48,SelfDiagnostic);
        contentValues.put(COL_49,MonitorCalibration);
        contentValues.put(COL_50,SaveCalibration);
        contentValues.put(COL_51,TelemetryLink);
        contentValues.put(COL_52,StartRecording);
        contentValues.put(COL_53,AircraftAlignment);
        contentValues.put(COL_54,Crew);
        contentValues.put(COL_55,Clearance);
        contentValues.put(COL_56,PowerUp);
        contentValues.put(COL_57,TakeOff);
        contentValues.put(COL_58,Communication);
        contentValues.put(COL_59,Landing);
        long result = db.insert(TABLE_NAME5,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertDataOnSiteSurvey(String NaamStudent, String Datum, String Pilot, String Observer, String WindSpeed, String Direction, String Obstruction, String ViewLimitations, String People, String Livestock, String Temperature, String Visibility, String Surface, String Permission, String Public, String AirTraffic, String Communication, String Proximity, String TakeOffArea, String LandingArea, String OperationalZone, String EmergencyArea, String HoldingArea){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_60,Pilot);
        contentValues.put(COL_26,Observer);
        contentValues.put(COL_61,WindSpeed);
        contentValues.put(COL_62,Direction);
        contentValues.put(COL_63,Obstruction);
        contentValues.put(COL_64,ViewLimitations);
        contentValues.put(COL_65,People);
        contentValues.put(COL_66,Livestock);
        contentValues.put(COL_67,Temperature);
        contentValues.put(COL_68,Visibility);
        contentValues.put(COL_69,Surface);
        contentValues.put(COL_70,Permission);
        contentValues.put(COL_71,Public);
        contentValues.put(COL_72,AirTraffic);
        contentValues.put(COL_58,Communication);
        contentValues.put(COL_73,Proximity);
        contentValues.put(COL_74,TakeOffArea);
        contentValues.put(COL_75,LandingArea);
        contentValues.put(COL_76,OperationalZone);
        contentValues.put(COL_77,EmergencyArea);
        contentValues.put(COL_78,HoldingArea);
        long result = db.insert(TABLE_NAME6,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    public boolean insertDataPreSiteSurvey(String NaamStudent, String Datum, String Pilot, String Observer, String WindSpeed, String Direction, String Obstruction, String ViewLimitations, String People, String Livestock, String Temperature, String Visibility, String Surface, String Permission, String Public, String AirTraffic, String Communication, String Proximity, String TakeOffArea, String LandingArea, String OperationalZone, String EmergencyArea, String HoldingArea){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,NaamStudent);
        contentValues.put(COL_3,String.valueOf(Datum));
        contentValues.put(COL_60,Pilot);
        contentValues.put(COL_26,Observer);
        contentValues.put(COL_61,WindSpeed);
        contentValues.put(COL_62,Direction);
        contentValues.put(COL_63,Obstruction);
        contentValues.put(COL_64,ViewLimitations);
        contentValues.put(COL_65,People);
        contentValues.put(COL_66,Livestock);
        contentValues.put(COL_67,Temperature);
        contentValues.put(COL_68,Visibility);
        contentValues.put(COL_69,Surface);
        contentValues.put(COL_70,Permission);
        contentValues.put(COL_71,Public);
        contentValues.put(COL_72,AirTraffic);
        contentValues.put(COL_58,Communication);
        contentValues.put(COL_73,Proximity);
        contentValues.put(COL_74,TakeOffArea);
        contentValues.put(COL_75,LandingArea);
        contentValues.put(COL_76,OperationalZone);
        contentValues.put(COL_77,EmergencyArea);
        contentValues.put(COL_78,HoldingArea);
        long result = db.insert(TABLE_NAME7,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
}
