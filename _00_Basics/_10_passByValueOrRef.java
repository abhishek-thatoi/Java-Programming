package _00_Basics;
// !Note that Java is strictly "pass-by-value" 

// * for primitive data types
// ! CHANGES        to the variable inside the method       ARE NOT REFLECTED    outside the method.

// public class _10_passByValueOrRef {

//     static void byValuePremitive(int a, int b){
//         a+=10;
//         b=10;
//         System.err.println("\n"+a+" "+b);
//     }

//     public static void main(String[] args) {
//         int x=10,y=15;
//         byValuePremitive(x,y);
//         System.err.println("\n"+x+" "+y);                 //!any change made is not reflected

//     }
    
// }



// * for Objects as parameter only
// ! CHANGES    to the object's state inside the method     ARE REFLECTED    outside the method.
/**
 * Inner_10_passByValueOrRef
 */

class myClass{

    public int value;

    myClass(int vl){
        this.value=vl;
    }

    // static void modifyObj(myClass obj_newVal){
    //     obj_newVal.value*=2;
    // }

    static void modifyMem(int obVal){
        obVal*=3;
    }
    
}

/**
 * Modify
 */
class Modify {

    static void modifyObj(myClass obj_newVal){
        obj_newVal.value*=2;
    }
    
    static void modifyMem(int obVal){
        obVal*=3;
    }
    
}

public class _10_passByValueOrRef {

    public static void main(String[] args) {
        myClass obj = new myClass(7);
        
        Modify.modifyObj(obj);                             // ! reference of object is passed
        System.out.println(obj.value);                     // output 14
        // ! changes are reflected

        obj.value=7;                                       // set values to deafult

        Modify.modifyMem(obj.value);                       // ! a copy value is passed for the primitive data member
        System.out.println(obj.value);                     // ouptut 7  
        // ! changes are NOT reflected

    }
}