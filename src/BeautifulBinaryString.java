public class BeautifulBinaryString {
    //Beautiful Binary String
    static int beautifulBinaryString(String b) {
        String u = "010";
        int count = 0, index = b.indexOf(u);
        while (index >= 0) {
            count++;
            index = b.indexOf(u, index + 3);
        }
        return count;
    }
}
