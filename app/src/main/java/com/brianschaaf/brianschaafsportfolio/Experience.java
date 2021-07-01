package com.brianschaaf.brianschaafsportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Experience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        Project epic = new Project("Epic Video Technologies, Inc.", "Frontend Mobile Engineer", 5);

        Project[] projects = {
                new Project("Epic Video Technologies, Inc.", "Frontend Mobile Engineer", R.drawable.epic_logo),
                new Project("Recreational Gear, Inc.", "Full Stack Software Engineer", R.drawable.react),
                new Project("Bullseye", "Back End Engineer", R.drawable.node)
        };
    }
}