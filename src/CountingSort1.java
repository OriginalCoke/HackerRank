public class CountingSort1 {
    //Counting Sort 1
    static int[] countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr) max = Math.max(max, a);
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) freq[arr[i]]++;
        return freq;
    }
}
