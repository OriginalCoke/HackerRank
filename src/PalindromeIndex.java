public class PalindromeIndex {
    //Palindrome Index
    public static void main(String[] args) {
        String s = "hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh";
        System.out.println(palindromeIndex(s));
    }

    static int palindromeIndex(String s) {
        int lo = 0, hi = s.length() - 1, count = 0, index = -1;
        while (lo < hi) {
            if (s.charAt(lo) == s.charAt(hi)) {
                lo++;
                hi--;
                continue;
            } else {
                count++;
                if (count > 1) return -1;
                if (s.charAt(lo + 1) == s.charAt(hi) && s.charAt(lo + 2) == s.charAt(hi - 1)) {
                    index = lo;
                    lo++;
                } else if (s.charAt(lo) == s.charAt(hi - 1) && s.charAt(lo + 1) == s.charAt(hi - 2)) {
                    index = hi;
                    hi--;
                }
            }
        }
        return index;
    }
}
