package com.example.gebruiker.droning;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Path;
import android.provider.ContactsContract;
import android.view.View;

import java.util.Date;

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
            public static final String COL_18 = "SystemTested";
            public static final String TABLE_NAME3 = "FlightLog";
            public static final String COL_20 = "TakeOffTime";
            public static final String COL_21 = "LandingTime";
            public static final String COL_22 = "Duration";
            public static final String COL_23 = "Aircraft";
            public static final String COL_24 = "AircraftSystem";
            public static final String COL_199 = "BatteryNo";
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
            public static final String COL_49 = "Monitor";
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
            public static final String TABLE_NAME8 = "EmbarkationChecklist";
            public static final String COL_109 = "GroundStation";
            public static final String COL_110 = "CameraMonitor";
            public static final String COL_111 = "Receiver";
            public static final String COL_112 = "TelemetryReceiver";
            public static final String COL_113 = "Laptop";
            public static final String COL_114 = "MobilePhone";
            public static final String COL_115 = "Anemometer";
            public static final String COL_116 = "FirstAid";
            public static final String COL_117 = "HardHat";
            public static final String COL_118 = "Radio";
            public static final String COL_119 = "Clothing";
            public static final String COL_120 = "AirNavigationMap";
            public static final String COL_121 = "Checklist";
            public static final String COL_122 = "Notepad";
            public static final String COL_123 = "SiteAssessment";
            public static final String COL_124 = "Signs";
            public static final String COL_125 = "FlightBattery";
            public static final String COL_126 = "TransmitterBattery";
            public static final String COL_127 = "CameraBattery";
            public static final String COL_128 = "StationBattery";
            public static final String COL_129 = "ChargerBattery";
            public static final String COL_130 = "PhoneBattery";
            public static final String COL_131 = "Airframe";
            public static final String COL_132 = "CameraMount";
            public static final String COL_133 = "CalibrationPlatform";
            public static final String COL_134 = "CameraLens";
            public static final String COL_135 = "CameraConnection";
            public static final String COL_136 = "CameraMemory";
            public static final String COL_137 = "CameraLanyard";
            public static final String COL_138 = "AttachmentBolt";
            public static final String COL_139 = "MultiFunctionCharger";
            public static final String COL_140 = "RequiredCharger";
            public static final String COL_141 = "BatteryChecker";
            public static final String COL_142 = "ScrewDrivers";
            public static final String COL_143 = "Allenkeys";
            public static final String COL_144 = "Pliers";
            public static final String COL_145 = "CableTies";
            public static final String COL_146 = "SideCutters";
            public static final String COL_147 = "PropellerNuts";
            public static final String COL_148 = "SpareProps";
            public static final String COL_149 = "SocketSet";
            public static final String TABLE_NAME9 = "OperationFlightPlan";
            public static final String COL_150 = "JobNo";
            public static final String COL_151 = "Version";
            public static final String COL_152 = "Pilot";
            public static final String COL_153 = "Observer";
            public static final String COL_154 = "PayloadOperator";
            public static final String COL_155 = "Helper";
            public static final String COL_156 = "Address";
            public static final String COL_157 = "Latitude";
            public static final String COL_158 = "Elevation";
            public static final String COL_159 = "VehicularAcces";
            public static final String COL_160 = "FlightPurpose";
            public static final String COL_161 = "OperationType";
            public static final String COL_162 = "DateWorkRequired";
            public static final String COL_163 = "MissionDuration";
            public static final String COL_164 = "CruisingAltitude";
            public static final String COL_165 = "MaxAltitude";
            public static final String COL_166 = "MaxDistance";
            public static final String COL_167 = "SatellitePic";
            public static final String COL_168 = "BAGViewerPic";
            public static final String COL_169 = "CrewPosition";
            public static final String COL_170 = "FlightBox";
            public static final String COL_171 = "AltLandingSites";
            public static final String COL_172 = "Distances";
            public static final String COL_173 = "RiskAssessment";
            public static final String COL_174 = "LocalAirTraffic";
            public static final String COL_175 = "RegionalAirTraffic";
            public static final String COL_176 = "MilitaryControl";
            public static final String COL_177 = "LowFlyingArea";
            public static final String COL_178 = "Airspace";
            public static final String COL_179 = "CivilMilitary";
            public static final String COL_180 = "ATCPermission";
            public static final String COL_181 = "MilitaryLowFlying";
            public static final String COL_182 = "Prohibited";
            public static final String COL_183 = "NOTAMAffect";
            public static final String COL_184 = "NOTAMpublished";
            public static final String COL_185 = "HelpdeskConsulted";
            public static final String COL_186 = "VisualFlightRules";
            public static final String COL_187 = "Distance150";
            public static final String COL_188 = "Distance50";
            public static final String COL_189 = "Class1Flight";
            public static final String COL_190 = "TUG";
            public static final String COL_191 = "FlightReported";
            public static final String COL_192 = "Terrain";
            public static final String COL_193 = "OtherAir
