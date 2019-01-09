public class Pangrams {
    //Pangrams
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.println(pangrams(s));
    }

    static String pangrams(String s) {
        String ls = s.toLowerCase();
        int[] bucket = new int[26];
        for (char c : ls.toCharArray()) {
            if (c >= 'a' && c <= 'z') bucket[c - 'a']++;
        }
        for (int b : bucket) {
            if (b == 0) return "not pangram";
        }
        return "pangram";
    }
}
