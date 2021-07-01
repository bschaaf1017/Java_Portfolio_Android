package com.brianschaaf.brianschaafsportfolio;

public class Project {

    String name;
    String description;
    //java converts drawables into numbers
    int image;

    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

}
