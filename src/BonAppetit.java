import java.util.List;

public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum = 0;
        for (int item : bill) sum += item;
        int ave = ((sum - bill.get(k)) / 2);
        if (ave == b) System.out.println("Bon Appetit");
        else System.out.println(b - ave);
    }
}
