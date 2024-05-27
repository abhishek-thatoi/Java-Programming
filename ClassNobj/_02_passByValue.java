package ClassNobj;

// * for Non-primitive Data types
// !Changes to the object's state inside the method are reflected outside the method.

/**
 * Inner_10_passByValueOrRef
 */

class myClass{

    public int value;

    myClass(int vl){
        this.value=vl;
    }
    
}

/**
 * Modify
 */
class Modify {

    static void modifyVal(myClass obj_newVal){              
        obj_newVal.value*=2;
    }
    
}

public class _02_passByValue {

    public static void main(String[] args) {
        myClass obj = new myClass(7);
        System.out.println(obj.value);

        Modify.modifyVal(obj);                             // !but here changes are reflected on object
        System.out.println(obj.value);                     // output 14
        
        obj.value=2;                                       // !change is refected
        System.out.println(obj.value);                     // output: 2   

        // if value was a private entity we could'nt have access it;
    }
}