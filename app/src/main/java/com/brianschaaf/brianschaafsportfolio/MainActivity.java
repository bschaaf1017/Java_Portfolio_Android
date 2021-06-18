package com.brianschaaf.brianschaafsportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.brianschaaf.brianschaafsportfolio.Experience;

public class MainActivity extends AppCompatActivity {

    CardView experienceCard;
    CardView educationCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        experienceCard = findViewById(R.id.card_view_experience);
        educationCard = findViewById(R.id.card_view_education);

        experienceCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent startersActivityIntent = new Intent(MainActivity.this, Experience.class);

                startActivity(startersActivityIntent);
            }
        });
//        educationCard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mainCourseActivityIntent = new Intent(MainActivity.this, MainCourseActivity.class);
//
//                startActivity(mainCourseActivityIntent);
//            }
//        });

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

        Button buttonDirections = findViewById((R.id.button_directions));
        buttonDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "geo:0,0?q=276+Glen+Iris+Drive%2C+GA?z=10";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(uri));
                startActivity(intent);
            }
        });

    }
}