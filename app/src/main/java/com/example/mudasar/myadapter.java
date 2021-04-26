package com.example.mudasar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class myadapter extends ArrayAdapter<String>
{
    Context context;
    String Name[];

    myadapter(Context c, String Name[]){
        super(c,R.layout.list,R.id.name,Name);
        context=c;
        this.Name=Name;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list,parent,false);


        TextView Namee=row.findViewById(R.id.name);

        Namee.setText(Name[position]);
        return row;
    }

}
