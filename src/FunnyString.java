public class FunnyString {
    //Funny String
    public static void main(String[] args) {
        String s = "acxz";
        System.out.println(funnyString(s));
    }

    static String funnyString(String s) {
        char[] c = s.toCharArray();
        int[] diff = new int[c.length - 1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length - 1; i++) {
            diff[i] = Math.abs(c[i] - c[i + 1]);
        }
        int lo = 0, hi = diff.length - 1;
        while (lo < hi) {
            if (diff[lo] != diff[hi]) return "Not Funny";
            lo++;
            hi--;
        }
        return "Funny";
    }
}
