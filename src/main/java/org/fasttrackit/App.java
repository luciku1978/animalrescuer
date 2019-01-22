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

//        Activity act1 = new Activity();
//        act1.name = "walk";
//        act1.description = "walking in the park";
//
//        Food foodItem1 = new Food();
//        foodItem1.name = "Chappy";
//        foodItem1.availability = true;
//        foodItem1.price = 250.50;
//        foodItem1.quantity = 100;
//        foodItem1.expiryDate = new Date(2018,12,31);
//
//        Pet animal1 = new Pet();
//        animal1.name = "Rex";
//        animal1.age = 2;
//        animal1.healthLevel = 10;
//        animal1.hungerLevel = 3;
//        animal1.moodLevel = 9;
//        animal1.favouriteActivity = act1;
//        animal1.favouriteFood = foodItem1;
//
//        System.out.println("My new pet is "+animal1.name+" !");
//
//
//        Adopter stapan1 = new Adopter();
//        stapan1.name = "Gelu";
//        stapan1.amountOfMoney = 15000;
//
//        VetDoctor doctor1 = new VetDoctor();
//        doctor1.name = "Alexandru";
//        doctor1.specialisation = "small animals";
//
//        Game firstGame = new Game();
//        firstGame.name = "Tamagochi";
//        firstGame.description = "a game about breeding a dog.";
//        firstGame.adopter = stapan1;
//        firstGame.pet = animal1;
//        firstGame.doctor = doctor1;

//        System.out.println("Wellcome to "+firstGame.name+","+firstGame.description+"\n"+
//                firstGame.adopter.name+" adopted "+firstGame.pet.name+".");

            Activity activity1 = new Activity("fetch","the pet brings back the ball");
            Food foodItem1 = new Food("Chappy",100,100,"20.12.2020",true);
            Owner owner1 = new Owner("John",2500,"Cluj","0751515151",35,"M");
            Pet pet1 = new Pet("dog","white","F","Rex",2,10,9,10,foodItem1,activity1,true);

            owner1.feed_the_pet(pet1,foodItem1);
            owner1.play_with_your_pet(pet1,activity1);

            Animal animal1 = new Animal ("dog","black","M");
            animal1.checkMood(animal1,true);

            pet1.checkMood(animal1,true);
    }


}
