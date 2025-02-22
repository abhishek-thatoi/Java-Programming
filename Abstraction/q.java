package begin.Abstraction;

abstract class Shape {
    abstract void draw();
}

// In real scenario, implementation is provided by others

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }

}

// In real scenario, method is called by programmer or user

class TestAbstraction {
    public static void main(String args[]) {
        Shape s = new Circle();
        s.draw();

    }

    abstract class Bank {
        abstract int getRateOfInterest();

    }

    class SBI extends Bank {
        int getRateOfInterest() {
            return 7;
        }

    }

    class PNB extends Bank {
        int getRateOfInterest() {
            return 8;
        }

    }
}