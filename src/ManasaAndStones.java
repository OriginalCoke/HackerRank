import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManasaAndStones {
    //Manasa and Stones
    static int[] stones(int n, int a, int b) {
        List<Integer> list = new ArrayList<>();
        int sum = (n - 1) * a, curr = sum;
        for (int i = 0; i < n; i++) {
            curr = sum - i * a + i * b;
            if (!list.contains(curr)) list.add(curr);
        }
        Collections.sort(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
