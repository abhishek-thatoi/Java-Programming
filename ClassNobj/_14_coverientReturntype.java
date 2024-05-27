package ClassNobj;

class Animal {

    Animal() {
        System.out.println("animal banja");
    }

    Animal giveBirth() {
        System.out.println("Animal gives birth");
        return new Animal();
    }
}

class Dog extends Animal {

    Dog() {
        System.out.println("kutta banja");
    }

    // Covariant return type
    Dog giveBirth() {
        System.out.println("Dog gives birth");
        return new Dog();
    }
}

public class _14_coverientReturntype {
    public static void main(String[] args) {
        Animal animal_obj = new Dog();
        animal_obj.giveBirth(); // Calls Dog's implementation, // Dog gives birth
    }
}
