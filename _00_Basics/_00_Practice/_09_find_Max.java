package _00_Basics._00_Practice;

import java.util.Scanner;

public class _09_find_Max {

    static void find_max(int x, int y, int z){
        // ! always remember ternary operator returns value,
        // * so we need to store what it returns
        String result=(x<y)?((y<z)?"Max = z":"Max = y"):((x<z)?"Max = z":"Max = x");   
        System.out.println(result); 
    }


    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.println("enter 3 numbers x,y,z");
        a = inp.nextInt();
        b=inp.nextInt();
        c=inp.nextInt();
        find_max(a,b,c);
    }
    
}
