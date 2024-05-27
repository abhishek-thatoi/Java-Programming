package _00_Basics;

public class _04_math_funcs {
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println("\n"+Math.min(15, 40));
        System.out.println("\nthe absolute  positive value: "+Math.abs(-6.89));

        System.out.println("square root func: "+Math.sqrt(81));
        System.out.println("pow func: "+Math.pow(5,2));


        int randomNum = (int)(Math.random() * 101);// random genearates an number between [0-1)and
        System.out.println("to generate a random number between 0-100:"+ randomNum);

        //for more  refer: https://www.w3schools.com/java/java_ref_math.asp

    }
    
}
