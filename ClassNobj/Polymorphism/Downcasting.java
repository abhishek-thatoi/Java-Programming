package begin.Polymorphism;

class Animal{
    void instance(){
        System.out.println("obj of class animal");
    }
    
}
class Dog{
    void instance(){
        System.out.println("obj of class dog");
    }

}

public class Downcasting {

    Dog d = new Animal();// Compilation error

    // If we perform downcasting by typecasting, ClassCastException
    // is thrown at runtime.

    Dog d = (Dog) new Animal();

    // Compiles successfully but ClassCastException is thrown at runtime

}