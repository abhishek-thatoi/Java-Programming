package ClassNobj;

// !TOPICS COVERED
// 1.properties of static data members, methods
// 2.and their limitations

class Student {
    int id;

    // static means belongs to class
    static String yr; //--------------------------- for Static variable memory is allocated only once during class loading
    String name;
    static String college = "KIIT";

    Student(int id, String yr, String name) {
        this.id = id;
        Student.yr = yr;                            // as yr is a static varible it is specified as class type variable
        this.name = name;
    }

    static void change() {                          // value of static data members is retained once allocated  
                                                    // untill changed using static data methods/constructors

        yr = "4th";                                 //! restriction
                                                    // static methods cannot use non static data members or call non static methods directly;
        college = "KISS";
    }

    void display() {
        System.out.println(id + " " + name + " " + college + " " + yr);
    }

}

class Execute {
    public static void main(String[] args) {
        Student s1;
        s1 = new Student(9084, "2nd", "Akshat");
        Student s3 = new Student(9099, "3rd", "Kammo");  // this also will display yr as 2nd as static var changes for
                                                                    // all at once, hence the last modification is diplayed
        Student s2 = new Student(9088, "2nd", "Anubhav");

        s1.display();
        s2.display();
        s3.display();

        Student.change();// static methods can be called without creating any object
                         // but if method is in some different class it is called by class name(as static is class specific),
                         // In case the method called is not static it will encounter error
        System.out.print("\n\n");

        s1.display();
        s2.display();
        s3.display();
        // main method is static in nature
        System.out.println(Student.yr);
        // System.out.println(id); //! generates error as only static can operate on static
        
    }
}
