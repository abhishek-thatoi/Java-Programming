package Java_rev;

// We can have as many main methods as we want but each has to be in a class which is not public
// Atmost only one class(among all classes containing a main fucntion) can be public
// while execution we can runn only one main function at a time

class mainS1 {

     static String main1obj=" main 1";
     public static void main(String[] args) {
         System.out.println(main1obj); 
     }
    
}

public class mainS2 {
     static String main2obj=" main 2";
     public static void main(String[] args) {
          System.out.println(main2obj);
     }
    
}

class Execute{
     public static void main(String[] args) {
          System.out.println("\n"+mainS1.main1obj+" "+mainS2.main2obj);// if static member is called outside the class, it is                                                           //called by class name
     }
}

