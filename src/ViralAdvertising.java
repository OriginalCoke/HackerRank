public class ViralAdvertising {
    //Viral Advertising
    static int viralAdvertising(int n) {
        int shared = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            int liked = shared / 2;
            sum += liked;
            shared = shared / 2 * 3;
        }
        return sum;
    }
}
