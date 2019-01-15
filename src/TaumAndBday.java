public class TaumAndBday {
    public static void main(String[] args) {
        //68406 12718
        //532909 315341 201009
        int b = 68406, w = 12718, bc = 532909, wc = 315341, z = 201009;
        System.out.println(taumBday(b, w, bc, wc, z));
    }

    //Taum and B'day
    static long taumBday(int b, int w, int bc, int wc, int z) {
        if (bc > wc) return taumBday(w, b, wc, bc, z);
        long res = (long) b * bc + (long) w * wc, diff = wc - bc;
        if (bc == wc || z >= diff) return res;
        else {
            res = (long) b * bc + (long) w * (bc + z);
        }
        return res;
    }
}
