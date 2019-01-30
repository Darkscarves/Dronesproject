package com.example.gebruiker.droning;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class EmbarkationChecklist extends AppCompatActivity {
    DatabaseHelper myDb;
    EditText StudentennaamEdit, DatumEdit;
    CheckBox GroundStationLeadsCBox, CameraMonitorLeadsCBox, AVReceiverLeadsCBox, TelemetryReceiverLeadsCBox, LaptopLeadsCBox, MobilePhoneAppEmergencyNoCBox, AnemometerCBox, FirstAidKitFireExtinguisherCBox, CrewIdentificationCBox, FluorescentJacketHardHatsCBox, TwoWayRadiosCBox, ClothingBootsCoatGlovesCBox, AirNavigationMapCBox, ChecklistManualsLogbooksCBox, NotepadPensCBox, SiteAssessmentFromCBox, SignsSafetyTapeConesCBox, FlightBatteryPacksCBox, TransmitterBatteryPacksCBox, CameraBatteryPacksCBox, GroundStationBatteryCBox, ChargerBatteryPacksCBox, MobilePhoneBatteryCBox, AirframeCBox, CameraMountCBox, FlightControllerTransmitterCBox, CalibrationPlatformCBox, CameraLensCBox, CameraConnectionLeadsCBox, CameraMemoryCardsCBox, CameraToAirframeLanyardCBox, CameraAttachmentBoltCBox, MultiFunctionBatteryChargerCBox, RequiredChargerLeadsCBox, BatteryCheckerCBox, ScewDriversFlatCrossDriveCBox, AllenKeysCBox, PliersStandardLongNoseCBox, CableTiesVariousSizesCBox, SideCuttersCBox, NylockPropellerNutsCBox, SparePropsTractorPusherCBox, SmallSocketSetCBox;
    Button SubmitBTN;
    DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.embarkationchecklist);
        DatumEdit=findViewById(R.id.DatumEdit);
        DatumEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();
                final int year=calendar.get(Calendar.YEAR);
                final int month=calendar.get(Calendar.MONTH);
                final int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(EmbarkationChecklist.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        DatumEdit.setText(year+"-"+(month+1)+"-"+day);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        myDb = new DatabaseHelper(this);

        StudentennaamEdit = (EditText)findViewById(R.id.StudentennaamEdit);
        DatumEdit = (EditText)findViewById(R.id.DatumEdit);
        GroundStationLeadsCBox = (CheckBox)findViewById(R.id.GroundStationLeadsCBox);
        CameraMonitorLeadsCBox = (CheckBox)findViewById(R.id.CameraMonitorLeadsCBox);
        AVReceiverLeadsCBox = (CheckBox)findViewById(R.id.AVReceiverLeadsCBox);
        TelemetryReceiverLeadsCBox = (CheckBox)findViewById(R.id.TelemetryReceiverLeadsCBox);
        LaptopLeadsCBox = (CheckBox)findViewById(R.id.LaptopLeadsCBox);
        MobilePhoneAppEmergencyNoCBox = (CheckBox)findViewById(R.id.MobilePhoneAppEmergencyNoCBox);
        AnemometerCBox = (CheckBox)findViewById(R.id.AnemometerCBox);
        FirstAidKitFireExtinguisherCBox = (CheckBox)findViewById(R.id.FirstAidKitFireExtinguisherCBox);
        CrewIdentificationCBox = (CheckBox)findViewById(R.id.CrewIdentificationCBox);
        FluorescentJacketHardHatsCBox = (CheckBox)findViewById(R.id.FluorescentJacketHardHatsCBox);
        TwoWayRadiosCBox = (CheckBox)findViewById(R.id.TwoWayRadiosCBox);
        ClothingBootsCoatGlovesCBox = (CheckBox)findViewById(R.id.ClothingBootsCoatGlovesCBox);
        AirNavigationMapCBox = (CheckBox)findViewById(R.id.AirNavigationMapCBox);
        ChecklistManualsLogbooksCBox = (CheckBox)findViewById(R.id.ChecklistManualsLogbooksCBox);
        NotepadPensCBox = (CheckBox)findViewById(R.id.NotepadPensCBox);
        SiteAssessmentFromCBox = (CheckBox)findViewById(R.id.SiteAssessmentFromCBox);
        SignsSafetyTapeConesCBox = (CheckBox)findViewById(R.id.SignsSafetyTapeConesCBox);
        FlightBatteryPacksCBox = (CheckBox)findViewById(R.id.FlightBatteryPacksCBox);
        TransmitterBatteryPacksCBox = (CheckBox)findViewById(R.id.TransmitterBatteryPacksCBox);
        CameraBatteryPacksCBox = (CheckBox)findViewById(R.id.CameraBatteryPacksCBox);
        GroundStationBatteryCBox = (CheckBox)findViewById(R.id.GroundStationBatteryCBox);
        ChargerBatteryPacksCBox = (CheckBox)findViewById(R.id.ChargerBatteryPacksCBox);
        MobilePhoneBatteryCBox = (CheckBox)findViewById(R.id.MobilePhoneBatteryCBox);
        AirframeCBox = (CheckBox)findViewById(R.id.AirframeCBox);
        CameraMountCBox = (CheckBox)findViewById(R.id.CameraMountCBox);
        FlightControllerTransmitterCBox = (CheckBox)findViewById(R.id.FlightControllerTransmitterCBox);
        CalibrationPlatformCBox = (CheckBox)findViewById(R.id.CalibrationPlatformCBox);
        CameraLensCBox = (CheckBox)findViewById(R.id.CameraLensCBox);
        CameraConnectionLeadsCBox = (CheckBox)findViewById(R.id.CameraConnectionLeadsCBox);
        CameraMemoryCardsCBox = (CheckBox)findViewById(R.id.CameraMemoryCardsCBox);
        CameraToAirframeLanyardCBox = (CheckBox)findViewById(R.id.CameraToAirframeLanyardCBox);
        CameraAttachmentBoltCBox = (CheckBox)findViewById(R.id.CameraAttachmentBoltCBox);
        MultiFunctionBatteryChargerCBox = (CheckBox)findViewById(R.id.MultiFunctionBatteryChargerCBox);
        RequiredChargerLeadsCBox = (CheckBox)findViewById(R.id.RequiredChargerLeadsCBox);
        BatteryCheckerCBox = (CheckBox)findViewById(R.id.BatteryCheckerCBox);
        ScewDriversFlatCrossDriveCBox = (CheckBox)findViewById(R.id.ScewDriversFlatCrossDriveCBox);
        AllenKeysCBox = (CheckBox)findViewById(R.id.AllenKeysCBox);
        PliersStandardLongNoseCBox = (CheckBox)findViewById(R.id.PliersStandardLongNoseCBox);
        CableTiesVariousSizesCBox = (CheckBox)findViewById(R.id.CableTiesVariousSizesCBox);
        SideCuttersCBox = (CheckBox)findViewById(R.id.SideCuttersCBox);
        NylockPropellerNutsCBox = (CheckBox)findViewById(R.id.NylockPropellerNutsCBox);
        SparePropsTractorPusherCBox = (CheckBox)findViewById(R.id.SparePropsTractorPusherCBox);
        SmallSocketSetCBox = (CheckBox)findViewById(R.id.SmallSocketSetCBox);
        SubmitBTN = (Button)findViewById(R.id.SubmitBTN);
        AddData();
    }

    public void AddData() {
     SubmitBTN.setOnClickListener(
             new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                     boolean isInserted = myDb.insertDataEmbarkationChecklist(
                             StudentennaamEdit.getText().toString(),
                             DatumEdit.getText().toString(),
                             GroundStationLeadsCBox.getText().toString(),
                             CameraMonitorLeadsCBox.getText().toString(),
                             AVReceiverLeadsCBox.getText().toString(),
                             TelemetryReceiverLeadsCBox.getText().toString(),
                             LaptopLeadsCBox.getText().toString(),
                             MobilePhoneAppEmergencyNoCBox.getText().toString(),
                             AnemometerCBox.getText().toString(),
                             FirstAidKitFireExtinguisherCBox.getText().toString(),
                             CrewIdentificationCBox.getText().toString(),
                             FluorescentJacketHardHatsCBox.getText().toString(),
                             TwoWayRadiosCBox.getText().toString(),
                             ClothingBootsCoatGlovesCBox.getText().toString(),
                             AirNavigationMapCBox.getText().toString(),
                             ChecklistManualsLogbooksCBox.getText().toString(),
                             NotepadPensCBox.getText().toString(),
                             SiteAssessmentFromCBox.getText().toString(),
                             SignsSafetyTapeConesCBox.getText().toString(),
                             FlightBatteryPacksCBox.getText().toString(),
                             TransmitterBatteryPacksCBox.getText().toString(),
                             CameraBatteryPacksCBox.getText().toString(),
                             GroundStationBatteryCBox.getText().toString(),
                             ChargerBatteryPacksCBox.getText().toString(),
                             MobilePhoneBatteryCBox.getText().toString(),
                             AirframeCBox.getText().toString(),
                             CameraMountCBox.getText().toString(),
                             FlightControllerTransmitterCBox.getText().toString(),
                             CalibrationPlatformCBox.getText().toString(),
                             CameraLensCBox.getText().toString(),
                             CameraConnectionLeadsCBox.getText().toString(),
                             CameraMemoryCardsCBox.getText().toString(),
                             CameraToAirframeLanyardCBox.getText().toString(),
                             CameraAttachmentBoltCBox.getText().toString(),
                             MultiFunctionBatteryChargerCBox.getText().toString(),
                             RequiredChargerLeadsCBox.getText().toString(),
                             BatteryCheckerCBox.getText().toString(),
                             ScewDriversFlatCrossDriveCBox.getText().toString(),
                             AllenKeysCBox.getText().toString(),
                             PliersStandardLongNoseCBox.getText().toString(),
                             CableTiesVariousSizesCBox.getText().toString(),
                             SideCuttersCBox.getText().toString(),
                             NylockPropellerNutsCBox.getText().toString(),
                             SparePropsTractorPusherCBox.getText().toString(),
                             SmallSocketSetCBox.getText().toString() );
                     if(isInserted =true)
                         Toast.makeText(EmbarkationChecklist.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                     else
                         Toast.makeText(EmbarkationChecklist.this, "Data not Inserted", Toast.LENGTH_SHORT).show();

                 }
             }
     );
 }
    public void toHome(View view)
    {
        Intent intent = new Intent(EmbarkationChecklist.this, MainActivity.class);
        startActivity(intent);
    }
}
