package com.turkerontasci.bananademo.Pages;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothDevice;
import android.companion.WifiDeviceFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.turkerontasci.bananademo.R;

public class Lights extends AppCompatActivity {

    ImageView turnAllOnImage, turnAllOffImage, lightAddImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights);

        turnAllOnImage = findViewById(R.id.turnAllOn);
        turnAllOffImage = findViewById(R.id.turnAllOff);
        lightAddImage = findViewById(R.id.lightAddImage);

        turnAllOnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bağlı olan akıllı ampulleri aç
            }
        });

        turnAllOffImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bağlı olan ampulleri kapat
            }
        });

        lightAddImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bluetooth veya WiFi cihazlarına erişerek yeni ışık ekle
            }
        });

    }
}