package ClassNobj;

public class _15_SuperKey {

}

class Animal {
    String color = "white";

    Animal() {
        System.out.println("animal is created");
    }

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        // super();
        System.out.println("dog is created");
    }

    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        // super.eat();
        bark();
    }

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

class TestSuper {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.printColor();

        Dog d2 = new Dog();
        d2.work();
    }
}



