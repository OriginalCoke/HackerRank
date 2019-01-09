public class ChocolateFeast {
    //Chocolate Feast
    static int chocolateFeast(int n, int c, int m) {
        int wrapper = n / c, count = wrapper;
        while (wrapper >= m) {
            count += wrapper / m;
            wrapper = wrapper % m + wrapper / m;
        }
        return count;
    }
}
