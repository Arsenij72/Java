
import java.util.Objects;
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String password = String.valueOf(scanner.nextLine());
        if (!Objects.equals(password, "Caput Draconis"))
            System.out.println("Off with you!");
        else if (password.equals("Caput Draconis"))
            System.out.println("Welcome!");

    }
}
