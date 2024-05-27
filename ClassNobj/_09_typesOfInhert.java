package ClassNobj;

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meowing...");
    }
}

public class _09_typesOfInhert {
    public static void main(String args[]) {

        System.out.println("Single inheritance");
        Dog d = new Dog();
        d.bark();
        d.eat();
        
        System.out.println("multilevel inheritance");
        BabyDog bd = new BabyDog();
        bd.bark();
        bd.eat();
        bd.weep();
        
        System.out.println("Heirarchical inheritance");
        Cat c = new Cat();
        c.meow();
        c.eat();
    }

}
