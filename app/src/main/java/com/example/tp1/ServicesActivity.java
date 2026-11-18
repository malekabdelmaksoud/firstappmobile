package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        // 1. Récupérer le bouton btnBackServices via findViewById
        Button btnBackServices = findViewById(R.id.btnBackServices);

        // 2. Définir un écouteur de clic avec finish() pour revenir à l'accueil
        btnBackServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
