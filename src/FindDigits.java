public class FindDigits {
    //Find Digits
    static int findDigits(int n) {
        int res = 0, dummy = n;
        while (dummy > 0) {
            int temp = dummy % 10;
            dummy /= 10;
            if (temp == 0) continue;
            if (n % temp == 0) res++;
        }
        return res;
    }
}
