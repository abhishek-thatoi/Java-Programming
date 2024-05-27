package ClassNobj.align;

// !NOTE: 
/*
 ! Interface
 * It can hve static constants and abstract methods only.
 * The Java compiler adds public and abstract keywords before the interface method.
 
 * Three reasons to use interface:
        1. to achieve abstraction.
        2. support the functionality of multiple inheritance.
        3. to achieve loose coupling
*/

interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class _05_interface {
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        d.msg();
    }
}
