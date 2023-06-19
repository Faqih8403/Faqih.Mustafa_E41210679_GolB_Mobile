package com.example.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.AssetFileDescriptor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;

public class ProximitySensorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_sensor);
        txtinfo = findViewById(R.id.txt_information);
        txtinfo.setText("Loading...");
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        proximitysensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if(proximitysensor == null){
            txtinfo.setText("Sensor Tidak Tersedia");
        } else {
            sensorManager.registerListener(this, proximitysensor, SensorManager.SENSOR_DELAY_NORMAL);

        }
    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        int sensorType = sensorEvent.sensor.getType();

        switch (sensorType){
            case Sensor.TYPE_PROXIMITY:
                txtinfo.setText(getResources().getString(R.string.label_proximity, sensorEvent.values[0]));
                if(sensorEvent.values[0] == 0) {
                    mPlayer = new MediaPlayer();
                    try {
                        AssetFileDescriptor as = this.getAssets().openFd("objek_mendekat.mp3");
                        mPlayer.setDataSource(as.getFileDescriptor(), as.getStartOffset(), as.getLength());
                        as.close();
                        mPlayer.prepare();
                        mPlayer.start();
                    } catch (Exception e) {
                        Toast.makeText(this, "Error Playing Music", Toast.LENGTH_SHORT).show();

                    }
                } else {
                    mPlayer = new MediaPlayer();
                    try {
                        AssetFileDescriptor as = this.getAssets().openFd("objek_menjauh.mp3");
                        mPlayer.setDataSource(as.getFileDescriptor(), as.getStartOffset(), as.getLength());
                        as.close();
                        mPlayer.prepare();
                        mPlayer.start();

                    } catch (Exception e) {
                        Toast.makeText(this, "Error Playing Music", Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        sensorManager.unregisterListener(this, proximitysensor);
    }
}