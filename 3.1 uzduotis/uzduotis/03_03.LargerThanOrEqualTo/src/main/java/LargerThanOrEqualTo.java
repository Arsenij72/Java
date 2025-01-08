
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the first number");
        int b = Integer.parseInt(scanner.nextLine());
        if (a > b) {
            System.out.println("Greater number is: " + a);
        }
        if (a < b) {
            System.out.println("Greater number is: " + b);
        } else if (a == b) {
            System.out.println("The numbers is equal!");
        }
    }
}
