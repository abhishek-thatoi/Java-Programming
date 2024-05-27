package ClassNobj;

// !TOPICS COVERED

// types of variable in java:
// 1. local- scope and life within a block
// 2. instance - memory allocated at run time
// 3. static
// ! if we print an object we get the refernce ID

class A {

    // Local variable within a block
    {
        int x = 20;
        System.out.println(x);
    }
    // System.out.println(x); // *ERROR

    // instance variable
    int data = 50;

    // static variable
    static final int m = 100;

    // local variable within a mehtod
    void method() {
        int n = 90;// local variable
    }
}// end of class

public class _01_classInstances {
    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.data);
        System.out.println(A.m);

        obj.data = 20;
        // obj.m=10; // ERROR as static and final, value cannot be altered

        System.out.println("\n" + obj.data); // out: 20
        // System.out.println(obj.m); // ERROR as static and final

    }

};


