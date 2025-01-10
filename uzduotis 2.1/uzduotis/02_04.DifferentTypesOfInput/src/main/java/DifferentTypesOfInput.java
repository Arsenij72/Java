
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");

        String input = scanner.nextLine();

        System.out.println("Give an integer:");

        int integer = Integer.parseInt(scanner.nextLine());

        System.out.println("Give a double:");
        double number = Double.parseDouble(scanner.nextLine());

        System.out.println("Give a boolean:");
        boolean cond = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + input);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + number);
        System.out.println("You gave the boolean " + cond);

    }
}
