public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int lo = 0, hi = 0, start = scores[0], min = start, max = start;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                hi++;
            } else if (scores[i] < min) {
                min = scores[i];
                lo++;
            }
        }
        return new int[]{hi, lo};
    }
}
