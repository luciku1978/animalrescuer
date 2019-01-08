package org.fasttrackit;

public class Owner extends Adopter {
    String adress;
    String phoneNumber;
    int age;
    String sex;

    public Owner(String name, int amountOfMoney, String adress, String phoneNumber, int age, String sex) {
        super(name, amountOfMoney);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.sex = sex;
    }
}
