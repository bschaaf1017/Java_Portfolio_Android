package com.brianschaaf.brianschaafsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Experience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        RecyclerView list = findViewById(R.id.recyler_view_projects);

        Project[] projects = {
                new Project("Epic Video Technologies, Inc.", "Frontend Mobile Engineer", R.drawable.epic_logo, "March 2021 - Present"),
                new Project("Recreational Gear, Inc.", "Full Stack Software Engineer", R.drawable.react, "Nov 2020 - March 2021"),
                new Project("Bullseye", "Back End Engineer", R.drawable.node, "Nov 2020 - Jan 2021")
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);
    }



}