package com.example.myapplication.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class Lesson1Intents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_intents);

        Button btnLesson1 = findViewById(R.id.explicitIntent);

        Button btnLesson2 = findViewById(R.id.implicitIntent);


        btnLesson1.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExplicitIntentActivity.class);
            startActivity(intent);
        });

        btnLesson2.setOnClickListener(v -> {
            Intent intent = new Intent(this, ImplicitIntentActivity.class);
            startActivity(intent);
        });
    }
}