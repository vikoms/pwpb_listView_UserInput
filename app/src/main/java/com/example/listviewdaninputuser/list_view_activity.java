package com.example.listviewdaninputuser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class list_view_activity extends AppCompatActivity {

    List<Hero> heroList;

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

//        Initialing Objects
        heroList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listView);


//        Adding some values to our list

        heroList.add(new Hero(R.drawable.spiderman, "Spiderman", "Avenger"));
        heroList.add(new Hero(R.drawable.joker, "Joker", "Injustice Gang"));
        heroList.add(new Hero(R.drawable.ironman, "Iron Man", "Avengers"));
        heroList.add(new Hero(R.drawable.doctorstrange, "Doctor Strange", "Avengers "));
        heroList.add(new Hero(R.drawable.captainamerica, "Captain America", "Avengers"));
        heroList.add(new Hero(R.drawable.batman, "Batman", "Injustice Justice League"));

//        Creating the adapter
        myListAdapter adapter = new myListAdapter(this, R.layout.custom_list,heroList);

//        Attching adapter to the listview

        listView.setAdapter(adapter);
    }



}
