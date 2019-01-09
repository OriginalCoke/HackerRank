public class HalloweenSale {
    //Halloween Sale
    static int howManyGames(int p, int d, int m, int s) {
        // Return the number of games you can buy
        int sum = 0, count = 0;
        while (sum <= s) {
            sum += p;
            if (p - d >= m) {
                p -= d;
            } else p = m;
            count++;
        }
        return count - 1;
    }
}
