package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.lesson1.ActivityLifeCycle;
import com.example.myapplication.lesson1.Lesson1Intents;
import com.example.myapplication.lesson1.Lesson1Layouts;
import com.example.myapplication.lesson1.Lesson1Views;

public class Lesson1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        Button btnLesson1 = findViewById(R.id.btnLesson1Views);

        Button btnLesson2 = findViewById(R.id.btnLesson1Layouts);

        Button btnLessonLifeCycle = findViewById(R.id.btnLesson1LifeCycle);

        Button btnLessonIntent = findViewById(R.id.btnLesson1Intends);

        btnLesson1.setOnClickListener(v -> {
            Intent intent = new Intent(this, Lesson1Views.class);
            startActivity(intent);
        });

        btnLesson2.setOnClickListener(v -> {
            Intent intent = new Intent(this, Lesson1Layouts.class);
            startActivity(intent);
        });

        btnLessonLifeCycle.setOnClickListener(v -> {
            Intent intent = new Intent(this, ActivityLifeCycle.class);
            startActivity(intent);
        });

        btnLessonIntent.setOnClickListener(v -> {
            Intent intent = new Intent(this, Lesson1Intents.class);
            startActivity(intent);
        });
    }
}