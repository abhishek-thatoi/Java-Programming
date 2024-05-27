package _00_Basics;

public class _02_data_types {
    public static void main(String[] args) {
        
        int num = 5;
        float myFloatNum = 5.99f;
        double myDouble = 3.14;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";


                                                // how to print a string
    // type-1
        String name = "John";
        System.out.println(name +  "\n");
    // type-2
        System.out.println("Hello " + name);

                                                // typecasting

    // 1.widening  type  casting 
          int myInt = 9;
          double nowDouble = myInt;     // since double has more space to accomodate : Automatic casting: int to double (implicit typecasting)
      
          System.out.println("outputs:" + myInt);      // Outputs 9
          System.out.println("outputs:" + nowDouble);   // Outputs 9.0

    // narrowing type  casting
        double  doub=9.8;
        int  num_doub= (int) doub;// manual  typecasting: double to  int (explicit typecasting)

        System.out.println("outputs:" + doub);         // Outputs 9.8
        System.out.println("outputs:" + num_doub);     // Outputs 9



    // POINTS YOU MUST KNOW ABOUT VARIBALES

        // Data Type	Size	    Description
        // byte	        1 byte	    Stores whole numbers from -128 to 127
        // short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
        // int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	        8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean	    1 bit	    Stores true or false values
        // char	        2 bytes	    Stores a single character/letter or ASCII values

    }
}
        