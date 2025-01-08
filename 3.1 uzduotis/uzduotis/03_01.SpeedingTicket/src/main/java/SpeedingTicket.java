
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give speed");
        int number = Integer.parseInt(scanner.nextLine());
        if (number > 120) {
            System.out.println("Give speed:" + number + " Speeding ticket!");
        } else if (number < 120) {
            System.out.println("Give speed:" + number + " Ok");
            // Write your program here.
        }
    }
}
