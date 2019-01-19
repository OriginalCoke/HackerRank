public class Anagram {
    //Anagram
    static int anagram(String s) {
        if (s.length() % 2 == 1) return -1;
        int index = s.length() / 2;
        int[] bucket = new int[26];
        for (int i = 0; i < index; i++) bucket[s.charAt(i) - 'a']++;
        for (int i = index; i < s.length(); i++) bucket[s.charAt(i) - 'a']--;
        int res = 0;
        for (int b : bucket) {
            if (b > 0) res += b;
        }
        return res;
    }
}
