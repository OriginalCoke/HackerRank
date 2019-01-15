public class CircularArrayRotation {
    //Circular Array Rotation
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n = queries.length, index = k % a.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int pos = queries[i];
            if (pos - k >= 0) res[i] = a[pos - k];
            else res[i] = a[pos + a.length - k];
        }
        return res;
    }
}
