package _00_Basics;

public class _02_typeCasting {
    public static void main(String[] args) {

        // they all have specific ranges do check in _02_typeCasting

        byte b = 127;
        char c= 'v';
        int i = 999999999;
        short s = 1024;
        
        float f = 0.567f;
        double d = 0.893458;

        double result = f*b + i/c - d*s ;

        // In Java, when you perform arithmetic operations involving different data types, 
        // the result will be promoted to the widest data type involved in the operation
        
        // float + integer - double = double
        System.out.println(f*b + " " + i/c + " " + s-d);
        System.out.println(result);
        

    }
}
