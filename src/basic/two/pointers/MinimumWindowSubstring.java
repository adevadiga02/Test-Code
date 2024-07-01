package basic.two.pointers;

import java.util.HashMap;
import java.util.Map;

// LC -> https://leetcode.com/problems/minimum-window-substring/

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minimumWindowSubstring(s, t));
    }

    public static String minimumWindowSubstring(String s, String t) {
        if(s.length() < t.length()) return "";
        Map<Character, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;

        for(int k = 0; k < t.length(); k++) {
            map.put(t.charAt(k), 0);
        }

        int initialCount = 0;
        String result = null;

        while(j <= s.length() - 1) {
            String currentSubString = "";

            while(j <= s.length() - 1 && initialCount > 0 || map.containsKey(s.charAt(j))) {
                if(map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
                    initialCount++;

                    if(initialCount == map.size()) {
                        initialCount= 0;
                        currentSubString = s.substring(i,j+1);
                        j++;
                        i = j;
                        if(result == null || currentSubString.length() <= result.length()) {
                            result = currentSubString;
                            // System.out.println(result);
                        }
                        break;
                    }
                }
                j++;
            }

            i++;
            j++;
        }


        return result;
    }
}
