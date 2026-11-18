package com.example.tp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Déclaration des 4 boutons
    private Button btnEvents;
    private Button btnServices;
    private Button btnTasks;
    private Button btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Liaison des composants graphiques aux objets Java via findViewById
        btnEvents = findViewById(R.id.btnEvents);
        btnServices = findViewById(R.id.btnServices);
        btnTasks = findViewById(R.id.btnTasks);
        btnSettings = findViewById(R.id.btnSettings);

        // 3. Gestionnaires d'événements et Intents explicites
        // Écouteur pour btnEvents -> EventsActivity
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });

        // Écouteur pour btnServices -> ServicesActivity
        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(intent);
            }
        });

        // Écouteur pour btnTasks -> TasksActivity
        btnTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                startActivity(intent);
            }
        });

        // Écouteur pour btnSettings -> SettingsActivity
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
