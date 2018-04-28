package com.example.janakannandakumaran.appcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ExperienceAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Experience> experiences;

    @Override
    public int getCount() {
        return this.experiences.size();
    }

    @Override
    public Object getItem(int position) {
        return this.experiences.get(position);
    }

    @Override
    public long getItemId(int positions) {
        return this.experiences.get(positions).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate(R.layout.experience_item, null);
        TextView textView = (TextView) rowView.findViewById(R.id.CompName);
        textView.setText(this.experiences.get(position).toString());

        return rowView;
    }

    public ExperienceAdapter(Activity context, ArrayList<Experience> experiences) {
        this.context = context;
        this.experiences = experiences;
    }
}
