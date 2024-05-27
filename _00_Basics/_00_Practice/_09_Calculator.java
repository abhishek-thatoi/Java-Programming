package _00_Basics._00_Practice;

import java.util.Scanner;

public class _09_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans= Integer.MIN_VALUE;

        System.out.println("enter 1st Operand :");
        int op1= sc.nextInt();
        System.out.println("enter 2nd Operand :");
        int op2= sc.nextInt();
        System.out.println("enter Operator :");
        char opt = sc.next().trim().charAt(0);

        while (true) {
            switch(opt){
                case '+':
                    ans = op1 + op2;
                    break;
                case '-':
                    if(op1>op2)
                        ans = op1 - op2;
                    else
                        ans = op2 - op1;
                        break;
                case '*':
                    ans = op1 * op2;
                    break;
                case '/':
                    ans = op1 / op2;
                    break;
                case '%':
                    ans = op1 % op2;
                    break;
                // default:
                //     System.out.println("enter Valid Inputs");
                //     break;       
            }
            if(ans!=Integer.MIN_VALUE){
            System.out.println("The answer is : "+(ans));
                break;
            }
        }
        System.exit(0);
    }
    
}
