package com.example.janakannandakumaran.appcv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CompetanceActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Competance> competances = new ArrayList<Competance>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.competance);

        competances.add(new Competance("Web","PHP",3,"php"));
        competances.add(new Competance("Web","HTML - CSS",4,"htmlcss"));
        competances.add(new Competance("Langage","C/C++",3,"c"));
        competances.add(new Competance("Langage","Python",3,"python"));
        competances.add(new Competance("Langage","java",3,"java"));
        competances.add(new Competance("Langage","MYSQL",2,"sql"));
        competances.add(new Competance("Langage","UML",3,"uml"));
        competances.add(new Competance("Langage","Angular JS",3,"angular"));
        competances.add(new Competance("Logiciel","National Instrument",3,"national"));

        ListView listView = (ListView) findViewById(R.id.listViewCompetences);
        CompetanceAdapter adapter = new CompetanceAdapter(this, competances);
        listView.setAdapter(adapter);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
