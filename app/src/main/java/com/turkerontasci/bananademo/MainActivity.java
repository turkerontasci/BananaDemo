package com.turkerontasci.bananademo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.turkerontasci.bananademo.Pages.Devices;
import com.turkerontasci.bananademo.Pages.Lights;
import com.turkerontasci.bananademo.Pages.Remote;

public class MainActivity extends AppCompatActivity {

    CardView cvRemote, cvLights, cvDevices;

    String weatherCondition[] = {"21°C Güneşli", "15°C Bulutlu", "0°C Karlı"};
    TextView currentCondition;
    ImageView weatherImage;

    Integer conditionImage[] = {
            R.drawable.ic_baseline_wb_sunny_24,
            R.drawable.ic_baseline_cloud_24,
            R.drawable.ic_snowflake
    };

    private void setWeatherCondition(int selectedCondition) {
        if (selectedCondition == 0) {
            weatherImage.setImageResource(conditionImage[0]);
            currentCondition.setText(weatherCondition[0]);
        } else if (selectedCondition == 1) {
            weatherImage.setImageResource(conditionImage[1]);
            currentCondition.setText(weatherCondition[1]);
        } else if (selectedCondition == 2) {
            weatherImage.setImageResource(conditionImage[2]);
            currentCondition.setText(weatherCondition[2]);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentCondition = findViewById(R.id.currentWeather);
        weatherImage = findViewById(R.id.weatherImage);

        setWeatherCondition(2);

        cvRemote = findViewById(R.id.card1);
        cvLights = findViewById(R.id.card2);
        cvDevices = findViewById(R.id.card3);

        cvRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Remote.class);
                startActivity(intent);
            }
        });

        cvLights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lights.class);
                startActivity(intent);
            }
        });

        cvDevices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Devices.class);
                startActivity(intent);
            }
        });

    }
}