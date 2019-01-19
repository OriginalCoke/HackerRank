public class MakingAnagrams {
    //Making Anagrams
    static int makingAnagrams(String s1, String s2) {
        int[] bucket = new int[26];
        for (int i = 0; i < s1.length(); i++) bucket[s1.charAt(i) - 'a']++;
        for (int i = 0; i < s2.length(); i++) bucket[s2.charAt(i) - 'a']--;
        int res = 0;
        for (int i = 0; i < 26; i++) res += Math.abs(bucket[i]);
        return res;
    }
}
