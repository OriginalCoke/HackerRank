public class FairRations {
    //Fair Rations
    static int fairRations(int[] B) {
        int count = 0;
        for (int i = 0; i < B.length - 1; i++) {
            if (B[i] % 2 == 1) {
                count += 2;
                B[i + 1]++;
            }
        }
        if (B[B.length - 1] % 2 == 0)
            return count;
        else {
            return -1;
        }
    }
}
