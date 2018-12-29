import java.util.HashSet;

public class Anagram {
    public static boolean anagram(String a, String b){
        HashSet check = new HashSet();
        for (char letter : a.toCharArray()) {
            check.add(letter);
        }
        for (char letter : b.toCharArray()) {
            if(check.add(letter) == true){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        String c = "baking";

        System.out.println(anagram(a,b));
        System.out.println(anagram(a,c));
    }
}
