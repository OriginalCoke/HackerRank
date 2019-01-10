import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HappyLadybugs {
    //Happy Ladybugs
    static String happyLadybugs(String b) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        boolean flag = true;
        for (char c : b.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (!list.contains(c)) list.add(c);
            else if (list.size() > 1 && c != list.get(list.size() - 1)) flag = false;
        }
        for (char m : map.keySet()) {
            if (m == '_') continue;
            else if (map.get(m) < 2) return "NO";
        }
        if (flag) return "YES";
        else if (map.containsKey('_')) return "YES";
        else return "NO";
    }
}
