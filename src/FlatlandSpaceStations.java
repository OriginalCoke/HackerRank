import java.util.Arrays;

public class FlatlandSpaceStations {
    //Flatland Space Stations
    static int flatlandSpaceStations(int n, int[] c) {
        Arrays.sort(c);
        int max = 0;
        for (int i = 0; i < c.length - 1; i++) {
            int mid = (c[i] + c[i + 1]) / 2;
            max = Math.max(max, mid - c[i]);
        }
        max = Math.max(max, c[0]);
        max = Math.max(max, n - 1 - c[c.length - 1]);
        return max;
    }
}
