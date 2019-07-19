import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Anagram {
    public static boolean anagram(String a, String b){
        HashMap<Character, Integer> countA = new HashMap();
        HashMap<Character, Integer> countB = new HashMap();
        for (char c : a.toCharArray()) {
            if (countA.containsKey(c)) {
                countA.put(c, countA.get(c) + 1);
            }
            else {
                countA.put(c, 1);
            }
        }
        for (char c : b.toCharArray()) {
            if (countB.containsKey(c)) {
                countB.put(c, countB.get(c) + 1);
            }
            else {
                countB.put(c, 1);
            }
        }
        if(countA.equals(countB)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        String c = "baking";

        System.out.println(anagram(a,b));
        System.out.println(anagram(a,c));
    }
}
