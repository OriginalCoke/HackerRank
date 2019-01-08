import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : ar) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int v : map.values()) res += v / 2;
        return res;
    }
}
