import java.util.ArrayList;
import java.util.List;

public class CountingSort2 {
    //Counting Sort 2
    static int[] countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) max = Math.max(max, a);
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) freq[arr[i]]++;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                for (int j = 0; j < freq[i]; j++) list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
