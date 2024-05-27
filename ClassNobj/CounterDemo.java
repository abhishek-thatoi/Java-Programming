package Java_rev.ClassNobj;

public class CounterDemo {
    
        static int count = 0;// will get memory when instance is created

        CounterDemo() {
            count++;
            System.out.println(count);
        }

        public static void main(String args[]) {
            CounterDemo c1 = new CounterDemo();
            CounterDemo c2 = new CounterDemo();
            CounterDemo c3 = new CounterDemo();
        }
    

}
