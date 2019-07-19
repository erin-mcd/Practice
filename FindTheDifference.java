import java.util.HashMap;
import java.util.*;
import java.util.Map;

class Solution {
    public char findTheDifference(String s, String t) {                     HashMap<Character, Integer> countA = new HashMap();
        HashMap<Character, Integer> countB = new HashMap();
        for (char c : s.toCharArray()) {
            if (countA.containsKey(c)) {
                countA.put(c, countA.get(c) + 1);
            }
            else {
                countA.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (countB.containsKey(c)) {
                countB.put(c, countB.get(c) + 1);

            }
            else {
                countB.put(c, 1);
            }
        }

        for(char c: countB.keySet()){
            if(!countA.containsKey(c)){
                return c;
            }
            if(countB.get(c) != countA.get(c)){
                return c;
            }
        }
        return 0;
    }
}
