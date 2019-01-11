import java.util.Arrays;

public class FindTheMedian {
    //Find the Median
    static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
