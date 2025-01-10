
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int input = Integer.parseInt(scan.nextLine());
        System.out.println(" " + input * 86400);

    }
}
