package org.fasttrackit;

public class Pet extends Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private Food favouriteFood;
    private Activity favouriteActivity;
    private boolean isAdopted;

    public Pet(String race, String colour, String sex, String name,
               int age,
               int healthLevel,
               int hungerLevel,
               int moodLevel,
               Food favouriteFood,
               Activity favouriteActivity,
               boolean isAdopted) {
        super(race, colour, sex);
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.moodLevel = moodLevel;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
        this.isAdopted = isAdopted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(byte healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(byte hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(byte moodLevel) {
        this.moodLevel = moodLevel;
    }

    public Food getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(Food favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public Activity getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(Activity favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean adopted) {
        isAdopted = adopted;
    }

    @Override
    public void checkMood(Animal animal, boolean isHappy) {

        if (isHappy = true && moodLevel > 5) {
                System.out.println("My " + super.getRace() + name +" seems to be  very happy!");

        } else
            {
            System.out.println("My " + super.getRace() + name +  "seems to be sad!");
        }
    }
}