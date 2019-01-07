import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int[] S = s.stream().mapToInt(Integer::intValue).toArray();
        int sum = 0, res = 0;
        for (int i = 0; i < m; i++) sum += S[i];
        res = sum == d ? 1 : 0;
        for (int i = m; i < S.length; i++) {
            sum = sum + S[i] - S[i - m];
            if (sum == d) res++;
        }
        return res;
    }
}
