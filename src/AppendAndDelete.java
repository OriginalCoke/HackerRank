public class AppendAndDelete {
    //Append and Delete
    static String appendAndDelete(String s, String t, int k) {
        int index = -1;
        for (int i = 0; i < s.length() && i < t.length(); i++) {
            if (s.charAt(i) == t.charAt(i)) {
                index++;
            } else break;
        }
        int change = s.length() + t.length() - 2 - 2 * index;
        if (k < change) return "No";
        else if (k == change) return "Yes";
        else {
            int left = k - change;
            return left >= (index + 1) * 2 || left % 2 == 0 ? "Yes" : "No";
        }
    }
}
