public class StrangeCounter {
    //Strange Counter
    static long strangeCounter(long t) {
        long n = 3, sum = n;
        while (sum < t) {
            n *= 2;
            sum += n;
        }
        sum -= n;
        return n + 1 + sum - t;
    }
}
