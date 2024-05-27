package Java_rev.CollectionFrame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _03_Iter_arrToHashMap {

    public static void main(String[] args) {

        int arr[]={3,4,5,6,2,6,3,3};
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){                     
                mp.put(arr[i],(mp.get(arr[i]))+1);
            }
            else{                                          //alternative: {mp.putIfAbsent(arr[i], 1);}
                mp.put(arr[i], 1);
            }
                
        }
        
        // ! The above logic is replaced by key.getOrDefault(key,default value)
        for(int i=0; i<arr.length; i++){
            mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
        }

        // ... populate the map ...
        // ! ways to iterate through HashMaps

        // Method 1:
        for (Integer key : mp.keySet()) {
            Integer value = mp.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Method 2: conventional,safe
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Method 3: kind of react glimpse(preeti simple and sound)
        mp.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });

        // Method 4: Iterator (scary but let it come)
        Iterator<Integer> keyIterator = mp.keySet().iterator();
        while (keyIterator.hasNext()) {
            Integer key = keyIterator.next();
            Integer value = mp.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }

}
