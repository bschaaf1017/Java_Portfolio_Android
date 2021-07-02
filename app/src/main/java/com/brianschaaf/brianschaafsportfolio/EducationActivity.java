package com.brianschaaf.brianschaafsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class EducationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        RecyclerView list = findViewById(R.id.recyler_view_schools);

        Project[] schools = {
                new Project("Hack Reactor", "Software Engineering Immersive", R.drawable.hrlogo, "2021"),
                new Project("Coursera", "Python Programming Specialization", R.drawable.coursera, "2020"),
                new Project("The International Culinary Center", "Culinary Arts and Hospitality Management", R.drawable.icc, "2006 - 2009")
        };

        SchoolsAdapter adapter = new SchoolsAdapter(schools);
        list.setAdapter(adapter);
    }
}