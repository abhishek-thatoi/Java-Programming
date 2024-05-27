package ClassNobj;

class first{
    int x=0;
    int y=5;

}

class second{
    int z=0;
}

public class _01_class_and_obj {
    public static void main(String[] args) {
        first  myobj = new first();
        System.out.println(myobj.x);
        myobj.x=9;
        System.out.println(myobj.x);
        myobj.y=7;
        second urobj  = new second();
        urobj.z=myobj.x+myobj.y; // both are accessible because they are pubic
        System.out.print(urobj.z);
    }
}

// package begin.classNobj;

// class Address {

//     String city, state, country;

//     public Address(String city, String state, String country) {

//         this.city = city;
//         this.state = state;
//         this.country = country;
//     }

// }

// class Emp {

//     int id;
//     String name;
//     Address address;

//     public Emp(int id, String name, Address address) {

//         this.id = id;
//         this.name = name;
//         this.address = address;
//     }

//     void display() {

//         System.out.println(id + " " + name);
//         System.out.println(address.city + " " + address.state + " " + address.country);
//     }

//     public static void main(String[] args) {

//         Address address1 = new Address("gzb", "UP", "india");
//         Address address2 = new Address("gno", "UP", "india");
//         Emp e = new Emp(111, "varun", address1);
//         Emp e2 = new Emp(112, "arun", address2);
//         e.display();
//         e2.display();

//     }

// }