package com.example.myapplication.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class ActivityLifeCycle extends AppCompatActivity {

    private static final String TAG = "LIFECYCLE_DEMO";
    private TextView tvStatus;

    private void logAndShow(String method) {
        Log.d(TAG, method);
        String currentText = tvStatus.getText().toString();
        tvStatus.setText(currentText + "\n" + method);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        tvStatus = findViewById(R.id.tvStatus);
        Button btnOpenSecond = findViewById(R.id.btnOpenSecond);
        Button btnFinish = findViewById(R.id.btnFinish);

        tvStatus.setText(""); // clear
        logAndShow("onCreate()");

        btnOpenSecond.setOnClickListener(v -> {
            startActivity(new Intent(ActivityLifeCycle.this, SecondActivity.class));
        });

        btnFinish.setOnClickListener(v -> finish());
    }

    @Override
    protected void onStart() {
        super.onStart();
        logAndShow("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logAndShow("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logAndShow("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logAndShow("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logAndShow("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logAndShow("onDestroy()");
    }
}