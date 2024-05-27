package ClassNobj;

// CONSTRUCTOR
// 1. called implicitly when an instance of object is created
// 2. Everytime an object is created using new() keyword, atleast one constructor is called
// 3. Constructor name must be same as its class name
// 4. Constructor must have no *explicit* return type
        // Does constructor return any value? yes, that is current class instance 


class Student {
    int rollno;
    String name;

    //default Constructor
    Student(){
        rollno=000;
        name= "new Student";
        System.out.println("\nObject has been created successfully");
    }

    //Parameterized Constructor ------------------------// if parameterized constructor is defined then 
                                                        // we must have to define AN explicit default constructor to take
                                                        // care of objects instantiated with and without constructor call with parameters()
    Student(int r, String str){
        rollno=r;
        name=str;
    }

    // Copy Constructor - THERE  is no such thing as copy constructor in java but
                        // we can pass an object as a parameter in parameterized constructor
    Student(Student S){
        rollno=S.rollno;
        name=S.name;        // incase of confusion use this.rollno = S.rollno;
    }

    void displayInformation() {
        System.out.println("\n\n"+rollno + " " + name);
    }

}

public class _03_Constructor {
    public static void main(String args[]) {

        Student s_new= new Student(), S1= new Student();
        S1.rollno=101;
        S1.name= "Ankit";
    
        //using CONSTRUCTOR
        Student S2 = new Student(111,"Karan");

        //using Copy Constructor
        Student S3 = new Student(S2);                       

        // like initializing printing can be done in either way
        System.out.println(s_new.rollno + " " + s_new.name); 
        S1.displayInformation();  
        System.out.println(S2.rollno + " " + S2.name);      
        S3.displayInformation();  
     
        
    }
}