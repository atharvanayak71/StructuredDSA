package StructuredDSA;
import java.util.HashMap;
public class LongestSubstringReplacement {
    static int characterReplacement(String s, int k) {
        HashMap <Character, Integer> map = new HashMap<>();
        int low = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for(int high = 0; high<s.length(); high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            while((high-low+1)-maxFreq>k){
                map.put(s.charAt(low),map.get(s.charAt(low))-1);
                if(map.get(s.charAt(low))==0){
                    map.remove(s.charAt(low));
                }
                low++;
            }
            maxLength = Math.max(maxLength, high - low + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }
}
