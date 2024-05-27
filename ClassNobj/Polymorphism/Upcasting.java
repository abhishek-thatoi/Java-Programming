package begin.Polymorphism;

// !The determination
// !of the method to be called is based on the object being
// !referred to by the reference variable.

// Polymorphism can be achieved by methods but not data members because data members cant be overriden.
 
class Bike {

    void run() {
        System.out.println("running");
    }

}

class Splendor extends Bike {

    void run()

    {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {

        Bike b1 = new Splendor();// upcasting
        // Bike b2 = new Bike();
        Splendor b3 = new Splendor();
        // Splendor b4 = new Bike();   ************************ERROR*****************************
        b1.run();
        // b2.run();
        b3.run();

    }

}