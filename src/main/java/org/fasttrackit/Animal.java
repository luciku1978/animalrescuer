package org.fasttrackit;

public class Animal {
    private String race;
    private String colour;
    private String sex;

    public Animal(String race, String colour, String sex) {
        this.race = race;
        this.colour = colour;
        this.sex = sex;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
