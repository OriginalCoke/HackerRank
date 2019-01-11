import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    //Equalize the Array
    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);
        int max = 0;
        for (int v : map.values()) {
            max = Math.max(max, v);
        }
        return arr.length - max;
    }
}
