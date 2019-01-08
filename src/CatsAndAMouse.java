public class CatsAndAMouse {
    //Cats and a Mouse
    static String catAndMouse(int x, int y, int z) {
        int a = Math.abs(x - z), b = Math.abs(y - z);
        if (a == b) return "Mouse C";
        else if (a > b) return "Cat B";
        else return "Cat A";
    }
}
