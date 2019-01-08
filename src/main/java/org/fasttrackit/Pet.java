package org.fasttrackit;

public class Pet extends Animal{
    private String name;
    private int age;
    private byte healthLevel;
    private byte hungerLevel;
    private byte moodLevel;
    private Food favouriteFood;
    private Activity favouriteActivity;
    private boolean isAdopted;

    public Pet(String race,String colour, String sex,String name,
               int age,
               byte healthLevel,
               byte hungerLevel,
               byte moodLevel,
               Food favouriteFood,
               Activity favouriteActivity,
               boolean isAdopted)
    {
        super(race,colour,sex);
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
        this.isAdopted = isAdopted;
    }
}
