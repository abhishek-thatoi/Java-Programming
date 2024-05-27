package begin.inheritance;

class Person {

    int id;

    String name;

    Person(int id, String name) {

        this.id = id;

        this.name = name;

    }
}

class Emp extends Person {

    float salary;

    Emp(int id, String name, float salary) {

        super(id, name);// reusing parent constructor

        this.salary = salary;

    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }

}

class TestSuper {

    public static void main(String[] args) {

        Emp e1 = new Emp(1, "ankit", 45000f);// here e1 is an instance of EMP but it is also an instance of Person

        e1.display();

    }
}