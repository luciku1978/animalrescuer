package org.fasttrackit;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "** Wellcome to the Pet Rescue Game! **" );

        Activity act1 = new Activity();
        act1.name = "walk";
        act1.description = "walking in the park";

        Food foodItem1 = new Food();
        foodItem1.name = "Chappy";
        foodItem1.availability = true;
        foodItem1.price = 250.50;
        foodItem1.quantity = 100;
        foodItem1.expiryDate = new Date(2018,12,31);

        Pet animal1 = new Pet();
        animal1.name = "Rex";
        animal1.type  = "dog";
        animal1.age = 2;
        animal1.healthLevel = 10;
        animal1.hungerLevel = 3;
        animal1.moodLevel = 9;
        animal1.favouriteActivity = act1;
        animal1.favouriteFood = foodItem1;

        System.out.println("My new pet is "+animal1.name+" !");


        Adopter stapan1 = new Adopter();
        stapan1.name = "Gelu";
        stapan1.amountOfMoney = 15000;

        VetDoctor doctor1 = new VetDoctor();
        doctor1.name = "Alexandru";
        doctor1.specialisation = "small animals";

        Game firstGame = new Game();
        firstGame.name = "Tamagochi";
        firstGame.description = "a game about breeding a dog.";
        firstGame.adopter = stapan1;
        firstGame.pet = animal1;
        firstGame.doctor = doctor1;

        System.out.println("Wellcome to "+firstGame.name+","+firstGame.description+"\n"+
                firstGame.adopter.name+" adopted "+firstGame.pet.name+".");


    }
}
