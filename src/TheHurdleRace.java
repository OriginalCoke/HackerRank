import java.util.Arrays;

public class TheHurdleRace {
    //The Hurdle Race
    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        return height[height.length - 1] - k > 0 ? height[height.length - 1] - k : 0;
    }
}
