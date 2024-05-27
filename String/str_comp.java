package begin.String;

// There are three ways to compare string in java:

// 1. By equals() method---------------------compares value

// 2. By = = operator------------------------compares reference not values

// 3. By compareTo() method

class Teststringcomparison4 {

    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = "Ratan";
        System.out.println(s1.compareTo(s2));// 0
        System.out.println(s1.compareTo(s3));// 1(because s1>s3)
        System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )

    }

}
