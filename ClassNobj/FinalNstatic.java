package begin.classNobj;
 
// A static final variable that is not initialized at the time of
// declaration is known as static blank final variable. 
//! It can be initialized only in static block.

class A {

    static int data=10;// static blank final variable
    static void re_initailise(int data){data=80;}


    public static void main(String args[]) {

        System.out.println(A.data);

    }

} 