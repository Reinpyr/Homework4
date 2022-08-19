public class Main {
    public static void main(String[] args) {
        int T = 22;

        String action = "";
        if (T < 17)
        {
            action = "Hit";
        }
        else if (T < 21)
        {
            action = "Stay";
        }
        else {
            action = "Bust";
        }
        System.out.println(action);
    }
}