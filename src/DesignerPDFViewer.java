import java.util.Arrays;

public class DesignerPDFViewer {
    //Designer PDF Viewer
    static int designerPdfViewer(int[] h, String word) {
        int n = word.length();
        int[] wordLen = new int[n];
        for (int i = 0; i < n; i++) {
            wordLen[i] = h[word.charAt(i) - 'a'];
        }
        Arrays.sort(wordLen);
        return wordLen[n - 1] * n;
    }
}
