package StructuredDSA;

import java.util.HashMap;

public class FruitsIntoBasket {
    static int totalFruit(int[] fruits) {
        int low = 0;
        int MaxLen = 0;
        HashMap<Integer, Integer> f = new HashMap<>();
        for(int high = 0; high<fruits.length; high++){
            int i = fruits[high];
            f.put(i,f.getOrDefault(i,0)+1);
            while(f.size()>2){
                f.put(fruits[low], f.get(fruits[low])-1);
                if(f.get(fruits[low])==0){
                    f.remove(fruits[low]);
                }
                low++;
            }
            MaxLen = Math.max(MaxLen, high-low+1);
        }
        return MaxLen;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,2,2};
        int ans = totalFruit(arr);
        System.out.println(ans);
    }
}
