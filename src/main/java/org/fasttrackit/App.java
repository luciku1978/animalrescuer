package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "** Wellcome to the Pet Rescue Game! **" );

        Pet animal1 = new Pet();
        animal1.name = "Rex";
        animal1.type  = "dog";
        animal1.age = 2;
        animal1.healthLevel = 10;
        animal1.hungerLevel = 3;
        animal1.moodLevel = 9;

        System.out.println("My new pet is "+animal1.name+" !");

    }
}
