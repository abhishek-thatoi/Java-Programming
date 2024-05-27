package ClassNobj;

// There are 3 ways to initialize object in java. 1. By reference variable
// 2. By method
// 3. By constructor 


class Student {
    int rollno;
    String name;

    void insertRecord(int r, String n) {
        rollno = r;
        name = n;
    }

    //default Constructor
    Student(){
        System.out.println("Object has been created successfully");
        rollno=201;
        name= "newStudent";
    }

    //Parameterized Constructor ------------------------// if parameterized constructor is defined then 
                                                        // we must have to define AN explicit default constructor to take
                                                        // care of objects instantiated without and constructor call with parameters()
    Student(int r, String str){
        rollno=r;
        name=str;
    }

    // Copy Constructor
    Student(Student S){
        rollno=S.rollno;
        name=S.name;
    }

    void displayInformation() {
        System.out.println(rollno + " " + name);
    }

}

public class _01_InitializingObj {
    public static void main(String args[]) {
        Student s1 = new Student();
        
        s1.rollno = 101;                                    //by reference
        s1.name = "Ankit";

        Student S2;
        S2= new Student();
        S2.insertRecord(102, "Brijbhusan");             // using method()

        // like initializing printing can be done in either way
        s1.displayInformation();
        System.out.println(S2.rollno + " " + S2.name);      
        
        //using CONSTRUCTOR
        Student S3 = new Student(111,"Karan");

        //using Copy Constructor
        Student S4 = new Student(s1);                       // using copy constructor
    }

}