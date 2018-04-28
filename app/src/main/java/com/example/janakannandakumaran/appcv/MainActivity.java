package com.example.janakannandakumaran.appcv;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button competance;
    Button formation;
    Button experience;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        competance = (Button) findViewById(R.id.competance);
        competance.setOnClickListener(this);

        formation = (Button) findViewById(R.id.formation);
        formation.setOnClickListener(this);

        experience = (Button) findViewById(R.id.experience);
        experience.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(competance))
        {
            Intent intent = new Intent(getApplicationContext(),CompetanceActivity.class);
            startActivity(intent);

        }

        if (view.equals(formation)){

            Intent intent = new Intent(getApplicationContext(), FormationActivity.class);
            startActivity(intent);
        }

        if (view.equals(experience)){
            Intent intent = new Intent(getApplicationContext(), ExperienceActivity.class);
            startActivity(intent);
        }
    }
}
