package com.example.myapplication.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.Lesson1Activity;
import com.example.myapplication.R;

public class Lesson1Views extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1_views);

        EditText editName = findViewById(R.id.editName);
        CheckBox checkAgree = findViewById(R.id.checkAgree);
        Button btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String name = editName.getText().toString();

            if (checkAgree.isChecked()) {
                Toast.makeText(this,
                        "Hello " + name + ", you agreed!",
                        Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this,
                        "Please agree to continue",
                        Toast.LENGTH_SHORT).show();
            }
        });

//        Button btnLesson1 = findViewById(R.id.btnLesson1);
//
//        btnLesson1.setOnClickListener(v -> {
//            Intent intent = new Intent(this, Lesson1Views.class);
//            startActivity(intent);
//        });
    }
}