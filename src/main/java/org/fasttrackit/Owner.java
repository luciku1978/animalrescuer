package org.fasttrackit;

public class Owner extends Adopter {
    private String adress;
    private String phoneNumber;
    private int age;
    private String sex;

    public Owner(String name, int amountOfMoney, String adress, String phoneNumber, int age, String sex) {
        super(name, amountOfMoney);
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
