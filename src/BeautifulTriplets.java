import java.util.*;

public class BeautifulTriplets {
    //Beautiful Triplets
    static int beautifulTriplets(int d, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);
        int res = 0;
        for (int a : arr) {
            int lo = a - d, hi = a + d;
            if (map.containsKey(lo) && map.containsKey(hi)) res += map.get(lo) * map.get(hi);
        }
        return res;
    }
}
