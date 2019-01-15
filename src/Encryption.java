public class Encryption {
    public static void main(String[] args) {
        String s = "wclwfoznbmyycxvaxagjhtexdkwjqhlojykopldsxesbbnezqmixfpujbssrbfhlgubvfhpfliimvmnny";
        System.out.println(encryption(s));
    }

    //Encryption
    static String encryption(String s) {
        String s1 = "", res = "";
        for (char c : s.toCharArray()) {
            if (c != ' ') s1 += c;
        }
        int n = s1.length(), row = (int) Math.sqrt(n), col = row;
        if (row * row != n) col = row + 1;
        for (int i = 0; i < col; i++) {
            int index = i;
            while (index < n) {
                res += s1.charAt(index);
                index += col;
            }
            res += " ";
        }
        return res.trim();
    }
}
