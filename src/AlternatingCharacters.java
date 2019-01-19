import java.util.*;

public class AlternatingCharacters {
    //Alternating Characters
    static int alternatingCharacters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) stack.push(c);
        }
        return s.length() - stack.size();
    }
}
