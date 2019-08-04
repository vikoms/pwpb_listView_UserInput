package com.example.listviewdaninputuser;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;

public class myListAdapter extends ArrayAdapter<Hero> {

    List<Hero> heroList;
    Context context;
    int resource;


    public myListAdapter(Context context, int resource, List<Hero> heroList) {
        super(context, resource, heroList);

        this.context = context;
        this.resource = resource;
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull  ViewGroup  parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvTeam = view.findViewById(R.id.textViewTeam);
        Button buttonDelete = view.findViewById(R.id.buttonDelete);

        Hero hero = heroList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(hero.getImage()));
        tvName.setText(hero.getName());
        tvTeam.setText(hero.getTeam());

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                romoveHero(position);
            }
        });
        return view;
    }

    private void romoveHero(final int position) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Are You Sure to Want to delete this ? ");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                heroList.remove(position);
                notifyDataSetChanged();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


}
