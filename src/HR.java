import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HR {
    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        // int[] nums = a.stream().mapToInt(Integer::intValue).toArray();
        Map<Integer, Integer> map = new HashMap<>();
        for (int A : a) map.put(A, map.getOrDefault(A, 0) + 1);
        int max = 0;
        for (int k : map.keySet()) {
            max = Math.max(max, map.get(k) + map.getOrDefault(k - 1, 0));
            max = Math.max(max, map.get(k) + map.getOrDefault(k + 1, 0));
        }
        return max;
    }
}
