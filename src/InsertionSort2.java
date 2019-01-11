public class InsertionSort2 {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {3, 4, 7, 5, 6, 2, 1};
        insertionSort2(n, arr);
    }

    //Insertion Sort - Part 2
    static void insertionSort2(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int index = i + 1;
                for (int j = index; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) swap(j, j - 1, arr);
                }
            }
            pt(arr);
        }
    }

    static void pt(int[] A) {
        String res = "";
        for (int a : A) res += a + " ";
        System.out.println(res.trim());
    }

    static void swap(int i, int j, int[] A) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
