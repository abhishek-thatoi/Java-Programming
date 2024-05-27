package begin.String;

// class Testimmutablestring {

//     public static void main(String args[]) {

//         String s = "Sachin";

//         s.concat(" Tendulkar");// concat() method appends the string at the end

//         System.out.println(s);// will print Sachin because strings are immutable objects

//     }
// }

class Testimmutablestring1 {

    public static void main(String args[]) {

        String s = "Sachin";

        s = s.concat(" Tendulkar");// now 's' will print Sachin Tendulkar !!!!BUT!!!!
                                   // !In such case, s points to the "Sachin Tendulkar". Please notice that still
                                   // sachin object is not modified.
        System.out.println(s);

    }

}

