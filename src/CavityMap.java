public class CavityMap {
    public static void main(String[] args) {
        String[] grid = {"989", "191", "111"};
        String[] res = cavityMap(grid);
        for (String s : res) System.out.println(s);
    }

    //Cavity Map
    static String[] cavityMap(String[] grid) {
        int n = grid.length, m = grid[0].length();
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                char g = grid[i].charAt(j);
                if (g > grid[i - 1].charAt(j) && g > grid[i].charAt(j - 1)
                        && g > grid[i].charAt(j + 1) && g > grid[i + 1].charAt(j))
                    grid[i] = grid[i].substring(0, j) + "X" + grid[i].substring(j + 1);
            }
        }
        return grid;
    }
}
