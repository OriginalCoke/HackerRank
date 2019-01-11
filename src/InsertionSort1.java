public class InsertionSort1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{2, 3, 4, 5, 1};
        insertionSort1(n, arr);
    }

    //Insertion Sort - Part 1
    static void insertionSort1(int n, int[] arr) {
        int a = arr[n - 1];
        boolean flag = true;
        for (int i = n - 2; i >= 0; i--) {
            if (a < arr[i]) {
                arr[i + 1] = arr[i];
                pt(arr);
            } else {
                arr[i + 1] = a;
                pt(arr);
                flag = false;
                break;
            }
        }
        if (flag) {
            arr[0] = a;
            pt(arr);
        }
    }

    static void pt(int[] arr) {
        String res = "";
        for (int a : arr) {
            res += a + " ";
        }
        System.out.println(res.trim());
    }
}
