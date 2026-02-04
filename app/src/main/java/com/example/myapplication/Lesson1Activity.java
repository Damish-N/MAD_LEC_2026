package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.lesson1.Lesson1Views;

public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        Button btnLesson1 = findViewById(R.id.btnLesson1Views);

        btnLesson1.setOnClickListener(v -> {
            Intent intent = new Intent(this, Lesson1Views.class);
            startActivity(intent);
        });
    }
}