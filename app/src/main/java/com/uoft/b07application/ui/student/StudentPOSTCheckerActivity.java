package com.uoft.b07application.ui.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.uoft.b07application.R;

public class StudentPOSTCheckerActivity extends StudentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    protected int setLayoutId() {
        return R.layout.activity_student_postchecker;
    }
    @Override
    protected void setMenu(){
        drawerLayout = findViewById(R.id.post_checker_drawer_layout);
        navigationView = findViewById(R.id.nav_post_checker_view);
        toolbar = findViewById(R.id.post_checker_toolbar);
    }
    @Override
    public void setButtonListeners(){

    }
}