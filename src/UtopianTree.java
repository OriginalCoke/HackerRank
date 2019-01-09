public class UtopianTree {
    //Utopian Tree
    static int utopianTree(int n) {
        int curr = 0, tall = 1;
        while (curr < n) {
            if (curr % 2 == 0) tall *= 2;
            else tall++;
            curr++;
        }
        return tall;
    }
}
