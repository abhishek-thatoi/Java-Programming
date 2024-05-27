package ClassNobj;

public class _11_methodOverload_typePromotion {

    //method A;
    void sum(int a, long b) {
        System.out.println(a + b);
        System.out.println("method A is called");
    }

    //method B;
    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
        System.out.println("method B is called");

    }

    public static void main(String args[]) {
        _11_methodOverload_typePromotion obj = new _11_methodOverload_typePromotion();
        obj.sum(20, 20);// now second int literal will be promoted to long
        obj.sum(20, 20, 20);
    }
}