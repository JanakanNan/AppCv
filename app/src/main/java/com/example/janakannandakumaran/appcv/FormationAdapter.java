package com.example.janakannandakumaran.appcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FormationAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Formation> formations;

    @Override
    public int getCount() {
        return this.formations.size();
    }

    @Override
    public Object getItem(int position) {
        return this.formations.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.formations.get(position).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate(R.layout.formation_item, null);
        TextView textView = (TextView) rowView.findViewById(R.id.CompName);
        textView.setText(this.formations.get(position).toString());

        return rowView;
    }

    public FormationAdapter(Activity context, ArrayList<Formation> formations) {
        this.context = context;
        this.formations = formations;
    }
}
