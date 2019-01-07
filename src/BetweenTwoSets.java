import java.util.Arrays;

public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int lo = a[a.length - 1], hi = b[0], res = 0;
        for (int i = lo; i <= hi; i++) {
            boolean f = true;
            for (int A : a) {
                if (i % A != 0) {
                    f = false;
                    continue;
                }
            }
            for (int B : b) {
                if (B % i != 0) {
                    f = false;
                    continue;
                }
            }
            if (f) res++;
        }
        return res;
    }
}
