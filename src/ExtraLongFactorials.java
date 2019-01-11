import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        int a = 25;
        extraLongFactorials(a);
    }

    //Extra Long Factorials
    static void extraLongFactorials(int n) {
        BigInteger b = new BigInteger("1");
        for (int i = n; i > 1; i--) {
            b = b.multiply(new BigInteger("" + i));
        }
        System.out.println(b);
    }
}
