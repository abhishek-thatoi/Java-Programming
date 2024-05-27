package begin.String;

class TestStringConcatenation1 {

    public static void main(String args[]) {

        String s = "Sachin" + " Tendulkar";

        System.out.println(s);// Sachin Tendulkar

    }

}

// ! The Java compiler transforms above code to this:

// String s=(new StringBuilder()).append("Sachin").append("Tendulkar).toString();



// class TestStringConcatenation2 {

//     public static void main(String args[]) {

//         String s =50 + 30 + "Sachin" + 40 + 40;

//         System.out.println(s);// 80Sachin4040
                                // ! Note: After a string literal, all the + will be treated as string concatenation operator

//     }
// }