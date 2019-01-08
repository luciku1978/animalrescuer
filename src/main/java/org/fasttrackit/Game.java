package org.fasttrackit;

public class Game {
    String name;
    String description;
    Adopter adopter;
    Pet pet;
    VetDoctor doctor;

    public Game(String name, String description, Adopter adopter, Pet pet, VetDoctor doctor) {
        this.name = name;
        this.description = description;
        this.adopter = adopter;
        this.pet = pet;
        this.doctor = doctor;
    }
}
