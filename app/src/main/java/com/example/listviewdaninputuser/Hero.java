package com.example.listviewdaninputuser;

import android.widget.Toast;

public class Hero {
    int image;
    String name,team;
    public Hero(int image, String name, String team) {
        this.name = name;
        this.image = image;
        this.team = team;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
