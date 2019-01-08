public class CountingValleys {
    static int countingValleys(int n, String s) {
        int pre = 0, curr = 0, count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'D') {
                curr--;
            } else curr++;
            if (curr < 0 && pre == 0) count++;
            pre = curr;
        }
        return count;
    }
}
