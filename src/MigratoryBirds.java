import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);
        int res = -1, max = 0;
        for (int k : map.keySet()) {
            if (map.get(k) > max) {
                res = k;
                max = map.get(k);
            } else if (map.get(k) == max) {
                res = res > k ? k : res;
            }
        }
        return res;
    }
}
