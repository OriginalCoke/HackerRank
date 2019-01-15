import java.util.HashSet;
import java.util.Set;

public class StringConstruction {
    //String Construction
    static int stringConstruction(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        return set.size();
    }
}