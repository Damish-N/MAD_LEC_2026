package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.myapplication.Lesson2.LessonTwoActivity;
import com.example.myapplication.Lesson2.TestFragment;

public class MainActivity extends AppCompatActivity {

    Button button,buttonLesson2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLesson1 = findViewById(R.id.btnLesson1);

        btnLesson1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Lesson1Activity.class);
            startActivity(intent);
        });

        buttonLesson2 = findViewById(R.id.btnLesson2);

        buttonLesson2.setOnClickListener(
                v->{
                    Intent intent1 = new Intent(MainActivity.this, LessonTwoActivity.class);
                    startActivity(intent1);
                }
        );
    }
}