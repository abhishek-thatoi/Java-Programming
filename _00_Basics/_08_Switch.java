package _00_Practice._10_SwitchCase;

// ! NOTE: 
// * if break is not used in a case, the next case gets in execution


import java.util.Scanner;

public class _08_Switch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("enter the date:\t");
        int day = inp.nextInt();

        switch(day){

            // enter the date: 3
            // Weekday
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;


            // enter the date: 6
            // Weekend
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
    
}
