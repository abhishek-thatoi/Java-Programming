package _00_Basics;

import java.util.Scanner;

public class _09_para_arg {

    static void print_method(String s, int id){
        System.out.println("roll no: "+id+" "+s+" are you there");
    }

    static int myMethod(int x) {
        return 5 + x;
    }


    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println("enter the string");
            String str= in.nextLine();
            System.out.println("enter the roll no.");
            int id=in.nextInt();   
            System.out.println("\n\nBeing KIITian sucks:");
            print_method(str, id);
        }
        System.out.print("yes sir your audible");

        // System.out.println(myMethod(3));
        
    }
    
}
 