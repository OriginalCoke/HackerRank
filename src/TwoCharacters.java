import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {
    //Two Characters
    static int alternate(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        char[] chars = new char[set.size()];
        int index = 0;
        for (char ss : set) {
            chars[index] = ss;
            index++;
        }
        int max = 0;
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                int count = 0;
                boolean flag = true;
                char a = chars[i], b = chars[j], pre = 'A';
                for (char c : s.toCharArray()) {
                    if (c == a || c == b) {
                        if (c == pre) {
                            flag = false;
                            break;
                        } else {
                            pre = c;
                            count++;
                        }
                    }
                }
                if (flag) max = Math.max(max, count);
            }
        }
        return max;
    }
}
