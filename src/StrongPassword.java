public class StrongPassword {
    //Strong Password
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        String numbers = "0123456789", lower_case = "abcdefghijklmnopqrstuvwxyz",
                upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", special_characters = "!@#$%^&*()-+";
        int min = 0;
        boolean[] b = new boolean[4];
        for (char c : password.toCharArray()) {
            String cc = String.valueOf(c);
            if (numbers.contains(cc)) b[0] = true;
            if (lower_case.contains(cc)) b[1] = true;
            if (upper_case.contains(cc)) b[2] = true;
            if (special_characters.contains(cc)) b[3] = true;
        }
        int count = 0;
        for (boolean bb : b) if (bb) count++;
        if (n >= 6) {
            if (count < 4) min = 4 - count;
        } else {
            int diff = 6 - n;
            if (diff > 4 - count) min = diff;
            else min = 4 - count;
        }
        return min;
    }
}
