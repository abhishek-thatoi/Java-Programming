package begin.Polymorphism;

// class Dog {

//     private void eat()                          //If there is any private, final or static method in a class, 
//                                                 //there is static binding.

//     {
//         System.out.println("dog is eating...");
//     }

//     public static void main(String args[]) {

//         Dog d1 = new Dog();

//         d1.eat();
//     }
// }

class Animal {

    void eat()

    {
        System.out.println("animal is eating...");
    }

}

class Dog extends Animal {

    void eat() {
        System.out.println("dog is eating...");
    }

    public static void main(String args[]) {

        Animal a = new Dog();// HERE type of object is determined at run time, and is called dynamic binding.
                             // Connecting a method call to the method body is known as binding.
        a.eat();
    }
}