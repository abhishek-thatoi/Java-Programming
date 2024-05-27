package ClassNobj;

// !Method Overriding
// behavior of a method is determined at runtime.


class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running ");
    }

}
 public class _13_methodOverRide {
 
    public static void main(String args[]){

        //Valid 
        Vehicle obj1 = new Vehicle();
        Vehicle obj2 = new Bike();
        Bike obj3 = new Bike();
        obj1.run(); // Vehicle is running 
        obj2.run(); // Bike is running 
        obj3.run(); // Bike is running 

        //Invalid
        // Bike obj4 = new Vehicle();// ERROR
    }
 }
