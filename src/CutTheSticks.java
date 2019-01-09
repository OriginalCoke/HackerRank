import java.util.*;

public class CutTheSticks {
    //Cut the sticks
    static int[] cutTheSticks(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) map.put(a, map.getOrDefault(a, 0) + 1);
        List<Integer> list = new ArrayList<>();
        //sort map keys
        for (int m : map.keySet()) list.add(m);
        Collections.sort(list);
        int n = list.size();
        int[] res = new int[n];
        res[0] = arr.length;
        int index = 1;
        for (int l : list) {
            if (index == n) break;
            res[index] = res[index - 1] - map.get(l);
            index++;
        }
        return res;
    }
}
