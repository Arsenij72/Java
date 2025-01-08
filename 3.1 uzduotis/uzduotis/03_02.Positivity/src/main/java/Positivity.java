
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 0) {
            System.out.println(+number + " The number is positive");
        } else if (number <= 0) {
            System.out.println(+number + " The number is not positive");

        }
    }
}
