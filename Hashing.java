package StructuredDSA;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion Operation
        map.put("India", 150);
        map.put("US", 30);
        map.put("China", 140);

        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("lun"));

        map.put("China", 190);
        System.out.println(map);
        int [] arr = {12,3,4,5,5,5,5,5};
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
     }
}
