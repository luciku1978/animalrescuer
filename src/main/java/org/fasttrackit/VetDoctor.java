package org.fasttrackit;

public class VetDoctor {
    String name;
    String specialisation;

    public VetDoctor(String name, String specialisation) {
        this.name = name;
        this.specialisation = specialisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
