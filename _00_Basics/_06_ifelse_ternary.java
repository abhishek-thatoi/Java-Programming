package _00_Basics;

import java.util.Scanner;

public class _06_ifelse_ternary{
    public static void main(String[] args) {

    //* HOW MANY DIGITS
        // int num;
        Scanner in= new Scanner(System.in);
        // System.out.println("enter a number");
        // num = in.nextInt();
        // String result= (num<100)? "its a two digit number":(num<1000)?"its a three digit number":"its a big number";
        // System.out.println(result);
    
    //* BONUS
        System.out.print("enter salary :\t");
        int salary =  in.nextInt();
        if (salary<=0){
            System.out.println("invalid input");
            // ! to exit the program (main func()) abruptly
            //* use System.exit(int status:) */
            System.exit(0);
        }

        if(salary<5000){
            System.out.println("Bonus : "+salary);
        }else if(salary>5000&&salary<20000)
            System.out.println("Bonus : "+ (salary*6)/10);
        else
            System.out.println("Bonus : "+ (salary*3)/10);
        


    }    
}
