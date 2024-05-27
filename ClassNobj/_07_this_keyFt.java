package ClassNobj;

// 1. To refer current class instance
class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    // output if this keyword is not used:
    // 0 null 0.0
    // 0 null 0.0

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

// 2. this.fun() : to invoke the current class method
class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m();//same as this.m()
        this.m();
    }

    // to return current class statement
    A getA(){
        return this;
    }
}

// 3. Constructor chaining OR reuse of constructor
// use of Default constructor by parameterized constructor and Vice versa
// ! NOTE: Call to this() must be the first statement in constructor.

class HelloDe {
    HelloDe() {
        System.out.println("hello De");
    }

    HelloDe(int x) {
        this();
        System.out.println(x);
    }
}

class HelloPara {
    HelloPara() {
        this(5);
        System.out.println("hello Para");
    }

    HelloPara(int x) {
        System.out.println(x);
    }
}

// 4. To pass object as argument

class Demo4 {
    void m(Demo4 obj) {
        System.out.println("method is invoked");
    }

    void p() {
        m(this);
    }
}

public class _07_this_keyFt {

    public static void main(String args[]) {

        // 1. To refer current class instance
        Student s1 = new Student(111,"ankit", 5000f);
        Student s2 = new Student(112,"sumit", 6000f);
        s1.display();
        s2.display();

        // 2. this.fun() : to invoke the current class method
        A func_call = new A();
        func_call.n();

        // 3. Constructor chaining OR reuse of constructor
        HelloPara bulaUsko = new HelloPara();

        // 4. To pass object as argumentx
        Demo4 ob1= new Demo4();
        ob1.p();
        // 5. To return current class instance

    }
}