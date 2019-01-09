public class AngryProfessor {
    //Angry Professor
    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int A : a) {
            if (A > 0) count++;
        }
        return a.length - count < k ? "YES" : "NO";
    }
}
