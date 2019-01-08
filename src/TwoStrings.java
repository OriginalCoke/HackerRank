import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    //Two Strings
    static String twoStrings(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char c1 : s1.toCharArray()) set.add(c1);
        for (char c2 : s2.toCharArray()) {
            if (set.contains(c2)) {
                return "YES";
            }
        }
        return "NO";
    }
}
