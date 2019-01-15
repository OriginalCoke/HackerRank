import java.util.Stack;

public class SuperReducedString {
    //Super Reduced String
    static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c != stack.peek()) stack.push(c);
            else stack.pop();
        }
        String res = "";
        while (!stack.isEmpty()) {
            res = stack.pop() + res;
        }
        return res.isEmpty() ? "Empty String" : res;
    }
}
