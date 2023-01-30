package com.example.sensors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public SensorManager sm = null;
    public String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        if(sm.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) !=null){
            text += "\nAccelerometer: True";
        }else{
            text += "\nAccelerometer: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) !=null){
            text += "\nAmbient temperature: True";
        }else{
            text += "\nAmbient temperature: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_GYROSCOPE) !=null){
            text += "\nGYROSCOPE: True";
        }else{
            text += "\nGYROSCOPE: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_GRAVITY) !=null){
            text += "\nGRAVITY: True";
        }else{
            text += "\nGRAVITY: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) !=null){
            text += "\nLINEAR ACCELERATION: True";
        }else{
            text += "\nLINEAR ACCELERATION: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) !=null){
            text += "\nMAGNETIC: True";
        }else{
            text += "\nMAGNETIC: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_PRESSURE) !=null){
            text += "\nPRESSURE: True";
        }else{
            text += "\nPRESSURE: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) !=null){
            text += "\nRELATIVE_HUMIDITY: True";
        }else{
            text += "\nRELATIVE_HUMIDITY: False";
        }

        if(sm.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) !=null){
            text += "\nROTATION_VECTOR: True";
        }else{
            text += "\nROTATION_VECTOR: False";
        }
        TextView textView = findViewById(R.id.txt);
        textView.setText(text);

    }
}
