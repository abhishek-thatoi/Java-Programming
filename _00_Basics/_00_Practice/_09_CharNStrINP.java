package _00_Basics._00_Practice;

import java.util.Scanner;

public class _09_CharNStrINP {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter a String:\t");
        String str = inp.next();
        System.out.println(str);
        char ch = str.charAt(4);
        System.out.println(ch);

        // but in single step
        char ch_1 = inp.next().trim().charAt(0);
        System.out.println(ch_1);
        
    } 
}
