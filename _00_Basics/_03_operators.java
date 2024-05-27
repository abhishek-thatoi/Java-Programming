package _00_Basics;

// TOPICS
// 1.BIT_wise operators
// 2.assignment  operators

public class _03_operators {
    public static void main(String[] args) {
    
    //  Arithmetic Operators: just as  that of  C++
    //  additon  assignment operator(+=)
        int x=25;
        x+=30;
        System.out.println(x);
        x %= 3;     // read operators form right to left and get just as (x = x % 3)



                                        //  BIT_wise operator


    int a = 5;
    int b = 7;

    // bitwise and
    // 0101 & 0111=0101 = 5
    System.out.println("a&b = " + (a & b));

    // bitwise or
    // 0101 | 0111=0111 = 7
    System.out.println("a|b = " + (a | b));

    // bitwise xor
    // 0101 ^ 0111=0010 = 2
    System.out.println("a^b = " + (a ^ b));

    // bitwise not
    // ~0101=1010
    // will give 2's complement of 1010 = -6
    System.out.println("~a = " + ~a);

         


    }
    
}
