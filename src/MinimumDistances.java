import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {
    //Minimum Distances
    static int minimumDistances(int[] a) {
        int min = a.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            if (map.containsKey(curr)) {
                min = Math.min(min, i - map.get(curr));
            }
            map.put(curr, i);
        }
        return min == a.length ? -1 : min;
    }
}
