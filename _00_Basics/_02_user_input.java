package _00_Basics;

import java.util.*; // ! we require this util package for scanner class

public class _02_user_input {
    public static void main(String[] args) {

    // Scanner Class    
        Scanner myobj= new Scanner(System.in);  //WE create a scanner object
        System.out.println("enter username");
        String line=myobj.nextLine();   //*takes entire line as user input along with space
        String word=myobj.next();   //*takes one word as user input
        System.out.println("enter roll number");
        int roll=myobj.nextInt();
        System.out.println("\nusername:"+word);
        System.out.println("\nusername:"+word);
        System.out.println("roll n0:"+roll);

//     Method	    Description
// nextBoolean()	Reads a boolean value from the user
// nextByte()	    Reads a byte value from the user 
// nextDouble()	    Reads a double value from the user
// nextFloat()	    Reads a float value from the user
// nextInt()	    Reads a int value from the user
// nextLine()	    Reads a String value from the user
// nextLong()	    Reads a long value from the user
// nextShort()	    Reads a short value from the user




    
    // Console Class 
    // Using Console to input data from user
        String name = System.console().readLine();
        System.out.println(name);

    }
    
//     Method	    Description
// nextBoolean()	Reads a boolean value from the user
// nextByte()	    Reads a byte value from the user 
// nextDouble()	    Reads a double value from the user
// nextFloat()	    Reads a float value from the user
// nextInt()	    Reads a int value from the user
// nextLine()	    Reads a String value from the user
// nextLong()	    Reads a long value from the user
// nextShort()	    Reads a short value from the user
}
