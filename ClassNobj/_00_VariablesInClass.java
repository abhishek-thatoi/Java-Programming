package ClassNobj;

import java.time.LocalDate;

// !TOPICS COVERED

// types of variable in java:
        // 1. local- scope and life within a block
        // 2. instance
        // 3. static 

public class _00_VariablesInClass {
    public static void main(String[] args) {


        // 1.local variables:

        {
            int x=20;
            System.out.println(x);
        }
        System.out.println(x);

        // 2.Instance Variables:

                // =Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
                // =created when an object of the class is created and destroyed when the object is destroyed.
                // =Unlike local variables, we may use access specifiers for instance variables.
                // =Initilisation of Instance Variable is not mandatory. Its default value is 0
                // =Instance Variable can be accessed only by creating objects.

        // 3.Static Variables: 

                // =Static variables are also known as Class variables.
                // =static variables are declared using the static keyword within a class outside any method, constructor, or block.
                // =Static variables are created at the start of the program execution and are destroyed automatically when the execution ends.
                // =Unlike instance variables, we can only have one copy of a static variable per class irrespective of how many objects we create.
                // =Initilisation of Static Variable is not mandatory. Its default value is 0
                // =If we access the static variable like Instance variable (through object), compiler will show the warning message and it wont hault the program. Compiler will replace the object name to class name automatically.
                // =If we access the static variable without classname, the compiler will automatically append the class name.
                // =To access static variables, we need not create any object of that class
        
    }
    
}
