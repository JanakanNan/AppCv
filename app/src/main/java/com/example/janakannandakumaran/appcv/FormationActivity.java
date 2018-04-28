package com.example.janakannandakumaran.appcv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FormationActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<Formation> formations = new ArrayList<Formation>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation);

        formations.add(new Formation("2009 - 2012","BAC","Lycée Martin Luther King \n STI genie electronique"));
        formations.add(new Formation("2012 - 2014","Ingénieur","EFREI \n Ingénieur electronique"));

        ListView listView = (ListView) findViewById(R.id.listViewFormation);
        FormationAdapter adapter = new FormationAdapter(this, formations);
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
