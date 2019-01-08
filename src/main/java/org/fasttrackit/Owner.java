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

    public void feed_the_pet(Pet myPet,Food hisFood){
        System.out.println(super.getName()+" just gave some "+hisFood.getName()+
                " food to his pet "+ myPet.getName()+" !");
    }

    public void play_with_your_pet(Pet myPet,Activity activity){
        System.out.println(super.getName()+" is playing "+activity.getName()+
                " in the park with his "+ myPet.getRace()+" "+myPet.getName()+"!");
    }
}
