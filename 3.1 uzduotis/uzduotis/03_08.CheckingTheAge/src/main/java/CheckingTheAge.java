
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int first = Integer.parseInt(scan.nextLine());
        if (first <= 120 && first >= 0) {
            System.out.println("OK");
        } else
            System.out.println("Impossible!");
    }
}
