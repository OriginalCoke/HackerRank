public class RunningTimeOfAlgorithms {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 1, 2};
        System.out.println(runningTime(arr));
    }

    //Running Time of Algorithms
    static int runningTime(int[] arr) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int index = i + 1;
                for (int j = index; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(j, j - 1, arr);
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static void swap(int i, int j, int[] A) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
