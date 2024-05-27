package ClassNobj;

class A {
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m();
        // same as this.m()
        this.m();// !calling method m for current class(while execution)
    }
}

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;// !this can be used to remove ambiguity btw current class 
        this.name = name;    // and amiguity gives error
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

public class _06_thisKey {
    public static void main(String args[]) {
        
        Student s1 = new Student(111, "ankit", 5000f);
        Student s2 = new Student(112, "sumit", 6000f);
        s1.display();
        s2.display();

        A a= new A();
        a.n();
    }
}