import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int input = scan.nextInt();
            if (input > 0) {
                System.out.println(input *= 2);
            }
            if (input < 0) {
                System.out.println("Unsuitable number");
            } else if (input == 0) {

                break;
            }
        }
    }
}