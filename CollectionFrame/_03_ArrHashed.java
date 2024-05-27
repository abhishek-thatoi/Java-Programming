package CollectionFrame;

import java.util.*;

public class _03_ArrHashed {
    // here both the methods (hash and hashing) do the same job and give the same end result
    static HashMap<Integer,Integer> hashing(int arr[], int n){

        HashMap<Integer,Integer> hsh=new HashMap<>();
        for(int i=0; i<n;i++){
            if(hsh.containsKey(arr[i])){
                hsh.put(arr[i],hsh.get(arr[i])+1);
            }else{
                hsh.put(arr[i],1);
            }
        }
        
        return hsh;
    }
    static HashMap<Integer,Integer> hash(int arr[], int n){

        HashMap<Integer,Integer> hsh=new HashMap<>();
        for(int i=0; i<arr.length;i++){
            hsh.put(arr[i],hsh.getOrDefault(arr[i], 0)+1);
        }

        return hsh;
    }


    public static void main(String[] args) {

        int arr[]={1,2,4,1,5,1,2,6,3,4};

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array:\t");
        int N= sc.nextInt();
        int [] array= new int[N];

        System.out.println("enter the elements of array:\t");
        for(int i=0; i<N;i++){
            array[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> frq=new HashMap<>();
            frq=hashing(array,N);

        System.out.println("frequency of numbers in array:");
        System.out.println("element\t|\tfrequency");
            for(HashMap.Entry<Integer,Integer> it: frq.entrySet()){                 //how it will display(the format)
                System.out.println(+it.getKey()+"\t:\t"+it.getValue());             //the structure of output
            }
        
    }
    
    
}
