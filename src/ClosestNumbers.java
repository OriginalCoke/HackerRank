import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    public static void main(String[] args) {
        int[] arr = {-5, 15, 25, 71, 63};
        int[] res = closestNumbers(arr);
        for (int r : res) System.out.println(r);
    }

    //Closest Numbers
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff == min) {
                res.add(arr[i]);
                res.add(arr[i + 1]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
