import java.util.Arrays;

public class BiggerIsGreater {
    public static void main(String[] args) {
        String w = "dkhc";
        System.out.println(biggerIsGreater(w));
    }

    //Bigger is Greater
    static String biggerIsGreater(String w) {
        int n = w.length(), index = -1;
        char[] word = w.toCharArray();
        for (int i = n - 1; i > 0; i--) {
            if (word[i] > word[i - 1]) {
                index = i;
                break;
            }
        }
        if (index < 0) return "no answer";
        for (int i = n - 1; i >= index; i--) {
            if (word[i] > word[index - 1]) {
                swap(word, i, index - 1);
                break;
            }
        }
        Arrays.sort(word, index, n);
        String res = "";
        for (char wo : word) res += wo;
        return res;
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
