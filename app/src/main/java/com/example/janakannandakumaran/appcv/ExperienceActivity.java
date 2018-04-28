package com.example.janakannandakumaran.appcv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperienceActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Experience> experiences = new ArrayList<Experience>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience);

        experiences.add(new Experience("Actuellement", "Ministère de l'intérieur",
                "Développeur"));
        experiences.add(new Experience("26 mai à 26 juin 2015", "IPSOS FRANCE",
                "Stage Technicien Support IT - " +
                        "(Assistance aux Utilisateurs/ Déploiement de matéreiel"));
        experiences.add(new Experience("Décembre 2014 à Juillet 2015", "COURTEPAILLE",
                "Employé polyvalent"));
        experiences.add(new Experience("Septembre 2014 à Mai 2015", "EFREI " +
                "Entrepreneur",
                "Gestion d'infrastructure/ Developpement de plugin/ Analyse des groupes" +
                        "Meetup/ Participation du projet Meet up"));
        experiences.add(new Experience("Septembre 2013 à Juin 2014", " FAP EFREI ",
                "Initiation bureautique auprès des seniors et de personnes en difficulté"));


        ListView listView = (ListView) findViewById(R.id.listViewExperience);
        ExperienceAdapter adapter = new ExperienceAdapter(this, experiences);
        listView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
