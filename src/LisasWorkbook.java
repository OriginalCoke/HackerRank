public class LisasWorkbook {
    public static void main(String[] args) {
        int n = 5, k = 3;
        int[] arr = {4, 2, 6, 1, 10};
        System.out.println(workbook(n, k, arr));
    }

    //Lisa's Workbook
    static int workbook(int n, int k, int[] arr) {
        int res = 0, page = 1, left = 1, index = 0;
        while (index < n) {
            int a = arr[index];
            if (a <= k) {
                if (a >= page) res++;
                index++;
            } else {
                if (a - left * k > 0) {
                    if (page > k * (left - 1) && page <= k * left) res++;
                    left++;
                } else {
                    if (page > k * (left - 1) && page <= a) res++;
                    left = 1;
                    index++;
                }
            }
            page++;
        }
        return res;
    }
}
