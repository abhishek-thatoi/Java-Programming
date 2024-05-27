package _00_Basics;

import java.time.LocalDate;

// !TOPICS COVERED



public class _01_variables_basics {

    //! NOTE
    //1.Variables in Java must be declared before they are used.
    //    data_type variable_name;


    public static void main(String[] args) {

        // Ways to declare a variable
            //1.
            int myVar;
            myVar=10;

            //2.
            int urVar=5;

        // Data types in java ----------- primitive

            double myDouble = 3.14;
            char myChar = 'A';
            boolean isTrue = true;
            String greeting = "Hello, World!";
        
        // TypeCasting in java

            // Implicit casting (widening)
            int intValue = 42;
            double doubleValue = intValue;          // since double has more space to accomodate

            // Explicit casting (narrowing)
            double anotherDouble = 3.14;
            int intFromDouble = (int) anotherDouble;

        // Default values
        
            int number; // Defaults to 0
            boolean flag; // Defaults to false
            Object obj; // Defaults to null 

    }
    
}
