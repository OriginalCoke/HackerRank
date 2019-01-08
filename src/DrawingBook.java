public class DrawingBook {
    //Drawing Book
    static int pageCount(int n, int p) {
        if (p == 1) return 0;
        if (n % 2 == 0) {
            if (p == n) return 0;
            else return Math.min((n - p - 1) / 2 + 1, (p - 2) / 2 + 1);
        } else {
            return Math.min((n - p) / 2, (p - 2) / 2 + 1);
        }
    }
}
