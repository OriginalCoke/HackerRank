import java.util.*;

public class WeightedUniformStrings {
    //Weighted Uniform Strings
    static String[] weightedUniformStrings(String s, int[] queries) {
        Set<Integer> list = new HashSet<>();
        int pre = s.charAt(0) - 'a' + 1;
        list.add(pre);
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i), second = s.charAt(i + 1);
            if (first != second) {
                pre = second - 'a' + 1;
                list.add(pre);
            } else {
                pre += second - 'a' + 1;
                list.add(pre);
            }
        }
        String[] res = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (list.contains(queries[i])) res[i] = "Yes";
            else res[i] = "No";
        }
        return res;
    }
}
