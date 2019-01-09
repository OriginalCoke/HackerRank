import java.util.HashMap;
import java.util.Map;

public class NonDivisibleSubset {
    public static void main(String[] args) {
        int[] S = {1, 7, 2, 4};
        int k = 3;
        System.out.println(nonDivisibleSubset(k, S));
    }

    //Non-Divisible Subset
    static int nonDivisibleSubset(int k, int[] S) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length; i++) {
            int m = S[i] % k;
            map.put(m, map.getOrDefault(m, 0) + 1);
        }
        for (int i = 0; i <= k / 2; i++) {
            if (i == 0 || (k % 2 == 0 && i == k / 2)) {
                if (map.containsKey(i)) res++;
            } else res += Math.max(map.getOrDefault(i, 0), map.getOrDefault(k - i, 0));
        }
        return res;
    }
}
