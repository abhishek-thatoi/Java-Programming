package ClassNobj;

//! USE:
// 1. one object acquires allowed properties and behaviors of a parent object
// 2. For Method Overriding (so runtime polymorphism can be achieved).
// 3. For Code Reusability

class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class _08_inheritance {

    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }

}