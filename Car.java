//there will be a person class and a car class.
//The car class will hold an array of Person objects and will have a function called
//Make rides. Which will make take an array of Person objects and will create an
//Array of cars for them to be in that is the best created list.


//TODO needs a master class that will have an array of cars, and a method to take
//in a list of people objects and create that array of cars until noone is left.


import java.util.*;

public class Car{
   public Person driver;
   public int seats; //number available in car (not including the driver)
   public ArrayList passengers;

   //If car constructor given driver and number of seats
   Car(Person driver, int seats){
     this.driver = driver;
     this.seats = seats;
   }

   //If car just given a driver
   Car(Person driver){
     this.driver = driver;
     this.seats = driver.seats;
   }

   //add a passenger
   public boolean addPassenger(Person toAdd){
     //if the car is at capacity then reject adding
     if (this.seats == 0) {
       return false;
     } else {
       passengers.add(toAdd);
       return true;
     }
   }

   //remove a passenger
   public void removePassenger(Person toRemove){
     //if the car is at capacity then reject adding
     passengers.remove(toRemove);
   }


   public static void main(String[] args) {
     Person kait = new Person("Kaitlin", "Marshall", 7);

   }
}
