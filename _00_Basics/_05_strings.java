package _00_Basics;

public class _05_strings {
    public static void main(String[] args) {
        String name = "chinaswami muttuswamy venugopal'iyer'";
        System.out.println("\n" + name);
        System.out.println("length of the string is: " + name.length());

        String text = "this place is called \'El dorado\'"; // the backslash char(\), turns special char into string
                                                            // char//
        System.out.println(text); // the next char after \ is treated as a string
        System.out.println(name.indexOf("iyer"));

        // String Concatination

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        // OR
        System.out.println(firstName.concat(lastName));
        System.out.println("get the difference");
        System.out.println(firstName + " " + lastName);

        // + operator does addition and concatination both

        int x = 10;
        int y = 20;
        int z = x + y; // z will be 30 (an integer/number)
        System.out.println("integer: " + z);

        String a = "10";
        String b = "20";
        String c = a + b; // z will be 1020 (a String)
        System.out.println("string: " + c);

    }

}
