public class HR_Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x1 > x2 && v1 > v2) || (x1 < x2 && v1 < v2)) return "NO";
        int t = 0;
        if (x1 < x2) {
            return kangaroo(x2, v2, x1, v1);
        }
        while (x1 + t * v1 > x2 + t * v2) {
            t++;
        }
        if (x1 + t * v1 == x2 + t * v2) return "YES";
        return "NO";
    }
}
