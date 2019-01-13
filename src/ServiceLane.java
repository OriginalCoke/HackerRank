public class ServiceLane {
    //Service Lane
    static int[] serviceLane(int n, int[][] cases, int[] width) {
        int[] res = new int[cases.length];
        for (int i = 0; i < cases.length; i++) {
            int start = cases[i][0], end = cases[i][1], min = 4;
            for (int j = start; j <= end; j++) {
                min = Math.min(min, width[j]);
            }
            res[i] = min;
        }
        return res;
    }
}
