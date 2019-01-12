public class SaveThePrisoner {
    //Save the Prisoner
    static int saveThePrisoner(int n, int m, int s) {
        return (m + s - 2) % n + 1;
    }
}
