package com.example.janakannandakumaran.appcv;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CompetanceAdapter extends BaseAdapter {

    private Activity context;
    public ArrayList<Competance> competances;

    @Override
    public int getCount() {
        return this.competances.size();
    }

    @Override
    public Object getItem(int position) {
        return this.competances.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.competances.get(position).hashCode();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate(R.layout.competance_item, null);
        TextView textView = (TextView) rowView.findViewById(R.id.CompName);
        textView.setText(this.competances.get(position).toString());

        ImageView imageViewComp =(ImageView) rowView.findViewById(R.id.ImageComp);

        imageViewComp.setImageResource(context.getResources().getIdentifier(this.competances
                .get(position).getLogo(), "drawable", context.getPackageName()));

        for (int i = 0; i<=5 ; i++){

            for (int e =  1 ;e<=this.competances.get(position).getNiveau(); e++){

                ImageView imageViewStar= (ImageView) rowView.findViewById( context.getResources().getIdentifier("compStar"+e,"id",context.getPackageName()) );
                imageViewStar.setImageResource(context.getResources().getIdentifier( "@android:drawable/btn_star_big_on", "drawable", context.getPackageName() ));

            }

        }

        return rowView;
    }

    public CompetanceAdapter(Activity context, ArrayList<Competance> competances) {
        this.context = context;
        this.competances = competances;
    }
}
