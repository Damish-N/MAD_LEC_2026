package com.example.myapplication.Lesson2;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;

public class LessonTwoActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lesson_two);

        button = findViewById(R.id.lessonTwobtn);


//        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentContainer, new TestFragment())
                    .commit();

            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentContainerTwo, new TestButtonFragment())
                    .commit();

                TreeButtonFragment fragment = new TreeButtonFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragmentContainerThree, fragment);
            fragmentTransaction.commit();



            button.setOnClickListener(
                    v->{
                        TreeButtonFragment fragmentOne = new TreeButtonFragment();
                        FragmentTransaction fragmentTransactionOne = fragmentManager.beginTransaction();
                        fragmentTransactionOne.replace(R.id.fragmentContainerThree, new TestButtonFragment());
                        fragmentTransactionOne.replace(R.id.fragmentContainerTwo,new TreeButtonFragment());
                        fragmentTransactionOne.commit();
                    }
            );



//        }

    }
}