package _00_Basics;

// !    .java file name same as that of class WHICH HOLDS main() FUCNTION?
// This is not a coincidence. In Java, all codes must reside inside a class(whose bite code is generated, and send to jvm, as the class contains the main() func.), 
// !    and *there is at most* one public class which contains the main() method.

public class _00_hello$ {
    public static void main(String[] args) {

                                    // **********IMP**********

        // public:    So that JVM can execute the method from anywhere.
        // static:    The main method is to be called by JVM without creating an object. The modifiers public and static can be written in either order.
        // void:      The main method doesn’t return anything.
        // main():    Name configured in the JVM.
        // ? String[]:  The main method accepts a single argument, i.e., an array of elements of type String.

        System.out.print("hello java"); 
        System.out.print("\nlets code");  

        // Output is accomplished by the built-in println( ) method. 
        // The "System" is a predefined class that provides access to the system, 
        // and "out" is the variable of type output stream connected to the console.

    }
}; // having a semicolon after a class is optional in java

                    // ********** WHAT IF THE CLASS NAME IS DIFFRENT THAN THAT OF FILE NAME**********

    // Then the class shouldnt be public, so we compile the file and run the class 
    // todo: javac (file name)
    //       java (class name)

                                            
