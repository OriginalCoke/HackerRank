import java.util.ArrayList;
import java.util.List;

public class ModifiedKaprekarNumbers {
    public static void main(String[] args) {
        int p = 1, q = 10000;
        kaprekarNumbers(p, q);
    }

    //Modified Kaprekar Numbers
    static void kaprekarNumbers(int p, int q) {
        List<Integer> list = new ArrayList<>();
        for (int i = p; i <= q; i++) {
            int d = countDigits(i);
            long sq = (long) i * (long) i;
            String num = "" + sq;
            int left = Integer.parseInt(num.substring(num.length() - d)), right = 0;
            String rightNum = num.substring(0, num.length() - d);
            if (rightNum.length() > 0) right = Integer.parseInt(rightNum);
            if (left + right == i) list.add(i);
        }
        String res = "";
        if (list.isEmpty()) System.out.println("INVALID RANGE");
        for (int l : list) res += l + " ";
        System.out.println(res.trim());
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
