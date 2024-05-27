package ClassNobj;

//! Features of thisKey

// Till now: 

//! 1.this key was ust just to refer the current class instance 

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee) {
        this.rollno = rollno;// !this can be used to remove ambiguity as it refers to the current instance of the class
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

// *Other features of thisKey

// 2.this can be used to invoke current class method (implicitly)
// 3.this() can be used to invoke current class constructor. 
// 4.this can be passed as an argument in the method call. 
// 5.this can be passed as argument in the constructor call. 
// 6.this can be used to return the current class instance from the method.



//! 2.this can be used to invoke current class method (implicitly).

class this_Method {
    int var;
    void m() {
        System.out.println("hello m");
    }

    void n() {
        System.out.println("hello n");
        // m();
        // same as this.m()
        this.m();// !calling method m for current class(while execution)
    }
}
class test{
          this_Method objM= new this_Method();
          //objM.var OR objM.var;
          // objM.n(); //error: we cannot *directly* instantiate an object of other class or call method of other class
                       //wihtin the current class --------------- has to be done within a defined method() or constructor 
    }


//! 3.this() can be used to invoke current class constructor. 
    // *used for constructor chaining : resuse of constructor
    // this() must be the first statement in constructor
class A_constChaining{
   A_constChaining() {
     this(5);
     System.out.println("hello a");
   }

   A_constChaining(int x){
     System.out.println(x);
   }
}


//! 3 more to go































class B {
     // this_A obj;    // *object is nothing but a variable of class type

     B(this_A obj) {
          this.obj = obj;
          obj.data=obj.data+5;
     } 

     void display() {
          System.out.println("Object of class B:\t"+obj.data);
          // using data member of A class
     }
}


class this_A {
     int data = 10;
     
     this_A() {
          System.out.println("object of class A:\t"+data);
          B b = new B(this);// passing an instance of current class A as an argument
          b.display();
     }

     public static void main(String args[]) {
          this_A a = new this_A();


     }
}