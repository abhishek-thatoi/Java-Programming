package ClassNobj.align;

 // !  NOTE:
    /*
     * WHEN a child class object is created or instantiated:
        1. Parent class constructor is called at first 
        2. instance initialization block is copied to the child class constructor as as line 1
        3. then execution of child class constructor begins

     *This ensures that any initialization logic defined in the parent class constructor is executed before the child class constructor runs.
    */
    

class A {
    A() {
        System.out.println("parent class constructor invoked");
    }
}

class B2 extends A {
    B2() {
        super();
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String args[]) {
        B2 b = new B2();// instance initializer block is created as soon as an instance is defined
        // it is copied by the compiler as the first line if this() constructor but is executed just after the super class constructor



    // output:
        // parent class constructor invoked
        // instance initializer block is invoked
        // child class constructor invoked
   
    }
}