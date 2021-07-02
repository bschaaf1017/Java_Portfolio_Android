package com.brianschaaf.brianschaafsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.brianschaaf.brianschaafsportfolio.Experience;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button experienceButton = findViewById(R.id.button_experience);
        experienceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent experienceActivity = new Intent(MainActivity.this, Experience.class);
                startActivity(experienceActivity);
            }
        });

        Button educationButton = findViewById(R.id.button_education);
        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent educationActivity = new Intent(MainActivity.this, EducationActivity.class);
                startActivity(educationActivity);
            }
        });

        Button emailButton = findViewById(R.id.button_email);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent launchEmailApp = new Intent(Intent.ACTION_SENDTO);
                launchEmailApp.setData(Uri.parse("mailto:bschaaf1017@gmail.com")); // only email apps should handle this
                startActivity(launchEmailApp);
            }
        });

        Button linkedInButton = findViewById(R.id.button_linkedin);
        linkedInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String linkedinURL = "https://www.linkedin.com/in/brian-schaaf/";
                Intent launchLinkedIn = new Intent(Intent.ACTION_VIEW);
                launchLinkedIn.setData(Uri.parse(linkedinURL));
                startActivity(launchLinkedIn);
            }
        });

        Button gitHubButton = findViewById(R.id.button_git_hub);
        gitHubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gitHubURL = "https://github.com/bschaaf1017";
                Intent launchGitHub = new Intent(Intent.ACTION_VIEW);
                launchGitHub.setData(Uri.parse(gitHubURL));
                startActivity(launchGitHub);
            }
        });

        Button buttonPhone = findViewById(R.id.button_phone);
        buttonPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "tel:4045633499";
                Intent launchDialer = new Intent(Intent.ACTION_DIAL);
                launchDialer.setData(Uri.parse(phoneNumber));
                startActivity(launchDialer);
            }
        });

        Button buttonDirections = findViewById((R.id.button_location));
        buttonDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "geo:0,0?q=Atlanta%2C+GA";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        });

    }
}