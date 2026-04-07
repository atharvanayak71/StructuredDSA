package StructuredDSA;

import java.util.HashMap;

public class LongestSubstring {
    static int LongestSubstringWithoutDuplicates(String s) {
        HashMap<Character, Integer> f = new HashMap<>();
        int low = 0;
        int MaxLen = 0;
        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);

            f.put(ch, f.getOrDefault(ch, 0) + 1);
            while (f.get(ch) > 1) {
                f.put(s.charAt(low), f.get(s.charAt(low)) - 1);
                if (f.get(s.charAt(low)) == 0) {
                    f.remove(s.charAt(low));
                }
                low++;
            }
                MaxLen = Math.max(MaxLen, high - low + 1);

        }
        return MaxLen;
    }

    public static void main(String[] args) {
        System.out.println(LongestSubstringWithoutDuplicates("abcabcbb"));
    }
}