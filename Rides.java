//TODO needs a master class that will have an array of cars, and a method to take
//in a list of people objects and create that array of cars until noone is left.
//This ^ should probably be the constructor...

//There should only be one Rides object.
//Can add a person. Get list of all people. Get list of all Cars. Add a car (?)

import java.util.*;

public class Rides{
   public ArrayList<Car> cars = new ArrayList();
   public ArrayList<Person> people = new ArrayList();


   //Rides object given list of people objects
   Rides(ArrayList<Person> people){
     //call some private method junk here on the list of people to make a list of cars
     this.people = people;
     this.cars = makeRides(people);
   }

   //bulk of work here. Will take a list of people and make a list of cars

   //TODO could split people list into two lists of people, drivers and passengers and work from there
   private ArrayList<Car> makeRides(ArrayList<Person> people){
     if (seatsAvailable(people) < 0) {
       System.out.println("ERROR: Not enough drivers!");
       return null; //not enough drivers for number of people
     }

     ArrayList<Person> drivers = getListOfDrivers(people);
     ArrayList<Person> passengers = getListOfPassengers(people);
     System.out.println(drivers);
     System.out.println(passengers);

     ArrayList<Car> cars = new ArrayList();
     cars.add(new Car(people.get(0)));
     return cars;
   }

   //will make sure there are enough drivers for everyone
   private int seatsAvailable(ArrayList<Person> people){
     int numPeople = people.size();
     int numSeats = 0;
     for (int i = 0; i < people.size(); i++) {
       if (people.get(i).getNumSeats() > 0) {
         numSeats += people.get(i).getNumSeats() + 1; //plus one because of driver
       }
     }
     return numSeats - numPeople;
   }

   //gets a list of the drivers
   private ArrayList<Person> getListOfDrivers(ArrayList<Person> people){
     ArrayList<Person> drivers = new ArrayList();
     for (int i = 0; i < people.size(); i++) {
       if (people.get(i).getNumSeats() > 0) {
         drivers.add(people.get(i));
       }
     }
     return drivers;
   }

   //gets a list of the passengers
   private ArrayList<Person> getListOfPassengers(ArrayList<Person> people){
     ArrayList<Person> passengers = new ArrayList();
     for (int i = 0; i < people.size(); i++) {
       if (people.get(i).getNumSeats() == 0) {
         passengers.add(people.get(i));
       }
     }
     return passengers;
   }

   public String toString(){
     String str = "";
     return str;
   }







   public static void main(String[] args) {
     Person kait = new Person("Kaitlin", "Marshall", 7);
     Person carina = new Person("Carina", "ERC", 0);
     Person andy = new Person("Andy", "ERC", 0);


     ArrayList<Person> people = new ArrayList<>();
     ArrayList<Person> marshall = new ArrayList<>();

     //Fill up myList with your Data Points
     people.add(kait);
     people.add(carina);
     people.add(andy);

     Rides rides = new Rides(people);
     /*
     //searching for all Marshall students
     String search = "Marshall";
     for (int i = 0; i < people.size(); i++){
       if (people.get(i).getLocation().contains(search)) {
         marshall.add(people.get(i));
       }
     }
     System.out.println(marshall.toString());
     */

   }
}
