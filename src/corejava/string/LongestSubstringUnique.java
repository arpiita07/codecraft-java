package corejava.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringUnique {
    static void main(String[] args) {
        //5. Longest Substring Without Repeating Characters Input abcabcbb  Output : 3 (because abc)
        //Sliding Window Leetcode 3
        String s = "abcabcbb";
        longestSubstring(s);
    }
    public static int longestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(left)); // if set [a,b,c] already contains a no need to add it
                left++;
            }

            set.add(s.charAt(i));

            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}
