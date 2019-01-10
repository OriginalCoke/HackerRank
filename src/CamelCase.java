public class CamelCase {
    //CamelCase
    static int camelcase(String s) {
        int count = 1;
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') count++;
        }
        return count;
    }
}
