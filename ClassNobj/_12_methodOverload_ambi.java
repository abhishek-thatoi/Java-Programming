package ClassNobj;



public class _12_methodOverload_ambi {

    // if methods differ just by sequence of parameter: amibiguity

    void sum(double a, float b) {
        System.out.println("a method invoked");
    }

    void sum(float a, double b) {
        System.out.println("b method invoked");
    }
    
    // if we have a function with same parameter format as that has been passed no type- promotion 
    // no ambiguity
    // here type promotion is always implicit
    void sum(double a, double b) {
        System.out.println("c method invoked");
    }

    void sum(float a, float b) {
        System.out.println("d method invoked");
    }

    public static void main(String args[]) {
        _12_methodOverload_ambi obj = new _12_methodOverload_ambi();
        obj.sum(20, 20);// method d
        obj.sum(20.0, 20);// method a
    }

    // Extra Notes:
                    // float is a single-precision floating-point type, and it provides approximately 7 decimal digits of precision.
                    // double is a double-precision floating-point type, and it provides approximately 15 decimal digits of precision.
                    // int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
                    // long	        8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                    // float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
                    // double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
                    
}// all the above can be implicitly type casted to double