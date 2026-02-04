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

public class Lesson1Layouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_layouts);

        Button btnLinear = findViewById(R.id.btnLinear);
        Button btnRelative = findViewById(R.id.btnRelative);
        Button btnFrame = findViewById(R.id.btnFrame);
        Button btnConstraint = findViewById(R.id.btnConstraint);

        btnLinear.setOnClickListener(v -> startActivity(new Intent(this, LinearDemoActivity.class)));
        btnRelative.setOnClickListener(v -> startActivity(new Intent(this, RelativeDemoActivity.class)));
        btnFrame.setOnClickListener(v -> startActivity(new Intent(this, FrameDemoActivity.class)));
        btnConstraint.setOnClickListener(v -> startActivity(new Intent(this, ConstraintDemoActivity.class)));

    }
}