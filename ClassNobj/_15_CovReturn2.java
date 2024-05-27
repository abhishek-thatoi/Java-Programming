package ClassNobj;

class A {
    A get() {
        return this;
    }
}

class B1 extends A {
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }

}

public class _15_CovReturn2 {
    public static void main(String args[]) {
        new B1().get().message();
    }   //In the main method, an instance of B1 is created using new B1(). 
        //Then, the get() method is called, followed by the message() method on the returned object.
        // The chaining of methods is possible because the get() method returns an object of type B1, and the message() method is part of class B1.

}
