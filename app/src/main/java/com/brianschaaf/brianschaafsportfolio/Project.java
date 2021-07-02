package com.brianschaaf.brianschaafsportfolio;

public class Project {

    String name;
    String position;
    String date;
    //java converts drawables into numbers
    int image;

    public Project(String name, String position, int image, String date) {
        this.name = name;
        this.position = position;
        this.image = image;
        this.date = date;
    }

}
