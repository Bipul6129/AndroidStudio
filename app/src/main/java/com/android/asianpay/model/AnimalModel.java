package com.android.asianpay.model;

import java.io.Serializable;

public class AnimalModel implements Serializable {
    private String name;
    private String scientificName;
    private String description;
    private String habitat;
    private String diet;

    public AnimalModel(String name, String scientificName, String description, String habitat, String diet) {
        this.name = name;
        this.scientificName = scientificName;
        this.description = description;
        this.habitat = habitat;
        this.diet = diet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "AnimalModel{" +
                "name='" + name + '\'' +
                ", scientificName='" + scientificName + '\'' +
                ", description='" + description + '\'' +
                ", habitat='" + habitat + '\'' +
                ", diet='" + diet + '\'' +
                '}';
    }
}

