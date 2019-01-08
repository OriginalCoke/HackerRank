public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for (int k : keyboards) {
            for (int d : drives) {
                int curr = k + d;
                if (curr == b) return b;
                if (curr < b) max = Math.max(max, curr);
            }
        }
        return max == 0 ? -1 : max;
    }
}
