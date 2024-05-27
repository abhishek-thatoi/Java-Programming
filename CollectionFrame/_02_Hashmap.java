package CollectionFrame;

import java.util.HashMap;                   // for(HashMap.Entry<String,Integer> it: empIds.entrySet(){}

import java.util.Map;                       // for(Map.Entry<String,Integer> it: empIds.entrySet(){}

//* */ Benifits of hashmap:(better to use only when key-value pair is required)
// 1. occupies memory only for elements which are present(unlike array hashing)
// 2

//difference bet hashmap and arraylist:

// *1.duplicates and keys
//     >ArrayList: Does not deal with keys, only values. You can have duplicate values.
//     >HashMap: Requires keys to be unique. Values can be duplicates.//!so no duplicate entries
// *O(insertion/deletion)
//     >ArrayList: Adding or removing elements from the end (amortized O(1)), but from the middle or beginning requires shifting        elements and takes O(n) time.
//     >HashMap: Inserting and deleting key-value pairs is generally fast (usually O(1)), but again, this depends on the hash function and potential collisions.

public class _02_Hashmap {

    public static void main(String[] args) {

        HashMap<String,Integer> empIds = new HashMap<>();
 
        // helps counting frequencies
        // identifying duplicates

        //to add

        empIds.put("habibi", 1);
        empIds.put("bibi", 4);
        empIds.put("bachhe", 12);
        empIds.put("bachhe", 12);
        empIds.put("bibiKeBachhe",4);

        System.out.println("\n"+empIds+"\n");

        //!HashMap METHODS()
        System.out.println(empIds.get("bachhe"));
        System.out.println(empIds.getOrDefault("bibiKeBachhe",0));
        System.out.println(empIds.containsKey("bibi"));   // returns ture
        System.out.println(empIds.containsValue("2"));  // returns false

        empIds.put("bachhe",14);                    // if key doesnt match adds a new entry(adding entry is for sure)
        empIds.replace("bibiKEbachhe",6);
        empIds.replace("habibiKeV",6);              //doesnt do anything if the key doesnt match
        empIds.putIfAbsent("bachhe",14);            //dosnt update or add entry if key is present(conditonal entry)

        //to remove 
        empIds.remove("bibiKeBachhe");
        System.out.println(empIds);


    // ! ITERATING through a Hashmap:  {keySet()/value()/ entrySet()} depending upon wt you wanna use

    //todo:_______________________________________________________________________________________ 

        //remember  for(datatype  key/value/entry : _map_name_.`value()/keySet()/entrySet()`)
        // here data type for:
        //         1. key: for (String key : empIds.keySet()){}
        //         2. value: for (Integer val: empIds.value()){}
        //         3. entry as Set: for( HashMap.Entry<String, Interger> hsh: empIds.entrySet()){}
    //todo:________________________________________________________________________________________
        
        // *iterate through keys only
        // System.out.print("Keys: ");
        //     for (String ky : empIds.keySet()) {
        //         System.out.print(ky);
        //         System.out.print(", ");
        //     }

        // *iterate through values only
        // System.out.print("\nValues: ");
        //     for (Integer vale : empIds.values()) {
        //         System.out.print(val);
        //         System.out.print(", ");
        //     }
    
        //! iterate through key/value entries
        System.out.print("\nEntries: ");
            String str; int vl;
            for (HashMap.Entry<String,Integer> ent : empIds.entrySet()) {
                str=ent.getKey();
                vl=ent.getValue();
                System.out.print(str+"="+vl+",\t");     // customisable as per need
                // System.out.print(ent+", ");             //display the entire set for each iteration/entryset/key-value pair(ent)
            }





    // * SET "!View!" of MAP
        // return set view of keys
        // using keySet()
        System.out.println("Keys: " + empIds.keySet());

        // return set view of values
        // using values()
        System.out.println("Values: " + empIds.values());

        // return set view of key/value(entire mapping) pairs
        // using entrySet()
        System.out.println("Key/Value mappings: " + empIds.entrySet());
    }

}
