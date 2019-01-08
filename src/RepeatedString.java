public class RepeatedString {
    //Repeated String
    static long repeatedString(String s, long n) {
        long count1 = 0, count2 = 0, left = n % s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                if (i < left) count2++;
                count1++;
            }
        }
        return n / s.length() * count1 + count2;
    }
}
