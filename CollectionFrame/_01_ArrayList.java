package CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
import javax.swing.SpringLayout;

public class _01_ArrayList{
    public static void main(String[] args) {
        // String names[] =new String[5];

        // Scanner sc= new Scanner(System.in);

        // names[0] = "vishudh";
        // names[1]="himanshu";
        // System.out.println("\n"+"enter name of students: \n");
        // for(int i=2;i<30; i++){
        //     names[i]=sc.nextLine();
        // }

    // !    Not so feasible method as memory is not dynamically allocated and is thus not scalable

    ArrayList<String> StdNames = new ArrayList<>();
        StdNames.add("hritesh");
    
    ArrayList<Integer> list2= new ArrayList<>();
    list2.add(45);
    list2.add(72);
    list2.add(16);


    List<Integer>list= new ArrayList<>();
        list.add(3);
        list.add(42);
        list.add(18);
        list.add(2,7);                    // adds element at specific index, rest elements are shifted accordingly(acc to zero indexing rule)
        list.add(0,51);
        list.add(23);
        list.add(17);
        list.addAll(4, list2);                    // used to add a new list to existing list

        System.out.println("\n"+list);

        System.out.println("\n"+list.get(3)+"\n");     // to get value of list at a particular index

        //!to update a value at any index:

        list.set(2, 9);

        // ! NOTE: when we add or remove an element at any index, other list elements are shifted accordingly  [    O(n)    ]

        // System.out.println("\n"+list);
        //     list.remove();                           // removes element at last index
        // System.out.println("\n"+list);
        //     list.remove(5);                          // removes element at a particular index
        // System.out.println("\n"+list);
        //     list.remove(Integer.valueOf(17));        // to remnove wrt value
        // System.out.println("\n"+list);
        //     list.clear();
        // System.out.println("\n"+list);

        //! to update a certain value to something at any index:
        list.removeIf(lambda-> lambda.equals(42));      //doesnt work for other

        // ! to iterate the list [using loops and iterator]
        
        // method:1
        // System.out.println("\n\n");
        // for( int i=0; i<list.size();i++){
        //     System.out.println(list.get(i));
        // }

        // method:2 (for each loop)
        // for(Integer i: list){
        //     System.out.println("no.:"+i);
        // }

        // method:3
        Iterator<Integer> it=list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        

    }

}