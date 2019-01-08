package org.fasttrackit;

public class Game {
    private String name;
    private String description;
    private Adopter adopter;
    private Pet pet;
    private VetDoctor doctor;

    public Game(String name, String description, Adopter adopter, Pet pet, VetDoctor doctor) {
        this.name = name;
        this.description = description;
        this.adopter = adopter;
        this.pet = pet;
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public VetDoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(VetDoctor doctor) {
        this.doctor = doctor;
    }
}
