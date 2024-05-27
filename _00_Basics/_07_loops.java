package _00_Basics;

// ! USE Case:
          // for() loop    :   when no.of iterations are known
          // while() loop  :   when no.of iterations are unknown


public class _07_loops {
    public static void main(String[] args) {


        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        
        for (String i : cars) {
            System.out.println(i);
        }

        // // OR

        // System.out.println(cars.length);
        // for( int i=0; i<4;i++){
        //   System.out.println(cars[i]);
        // }
      
        //The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

        // finding no.of digits in a number
        int  number = 32425;

        int temp= number;
        int dgit=0;
        while(temp!=0){
          temp = temp/10;
          dgit++;
        }

        System.out.println("no.of digits = " + dgit);
    }
    
}
