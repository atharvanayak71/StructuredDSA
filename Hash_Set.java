package StructuredDSA;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        set.add(4);
        set.add(6);
        set.add(8);
        set.add(9);


        System.out.println(set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
