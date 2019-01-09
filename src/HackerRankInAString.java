public class HackerRankInAString {
    //HackerRank in a String!
    static String hackerrankInString(String s) {
        int index = -1;
        String h = "hackerrank";
        for (char c : h.toCharArray()) {
            index = s.indexOf(c, index + 1);
            if (index < 0) return "NO";
        }
        return "YES";
    }
}
