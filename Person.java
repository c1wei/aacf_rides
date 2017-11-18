//there will be a person class and a car class.
//The car class will hold an array of Person objects and will have a function called
//Make rides. Which will make take an array of Person objects and will create an
//Array of cars for them to be in that is the best created list.

import java.util.*;

public class Person{
   public String name;
   public String phone;
   public String location;
   public int seats; //number of seats in their car. If 0, then not a driver.
                     //does not include the driver's seat

   //constructor if all parameters available
   Person(String name, String phone, String location, int seats){
     this.name = name;
     this.phone = phone;
     this.location = location;
     this.seats = seats;
   }

   //constructor if driver is unknown, will default to false
   Person(String name, String location, int seats){
     this.name = name;
     this.phone = "unkown";
     this.location = location;
     this.seats = seats;
   }

   //getters
   public String getName() { return name; }
   public String getPhone() { return phone; }
   public String getLocation() { return location; }
   public int numSeats() { return seats; }


   public static void main(String[] args) {
       Person kait = new Person("Kaitlin", "Marshall", 7);
       System.out.println(kait.getName());
   }
}
