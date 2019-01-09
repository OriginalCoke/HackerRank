public class JumpingOnTheClouds {
    //Jumping on the Clouds
    static int jumpingOnClouds(int[] c) {
        int res = 0, i = 0, n = c.length;
        while (i < n) {
            if (i == n - 1) break;
            else if (i == n - 2 || c[i + 1] == 0 && c[i + 2] == 1) {
                i++;
            } else if (c[i + 1] == 1 || c[i + 1] == 0 && c[i + 2] == 0) {
                i += 2;
            }
            res++;
        }
        return res;
    }
}
