public class JumpingOnTheCloudsRevisited {
    //Jumping on the Clouds: Revisited
    static int jumpingOnClouds(int[] c, int k) {
        int n = c.length, i = 0, tot = 100;
        while (i < n) {
            if (c[i] == 0) tot--;
            else tot -= 3;
            i = i + k;
        }
        return tot;
    }
}
