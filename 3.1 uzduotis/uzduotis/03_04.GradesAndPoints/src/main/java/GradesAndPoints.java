
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int grade = Integer.parseInt(scanner.nextLine());
        if (grade > 100)
            System.out.print("incredible");
        else if (grade >= 90)
            System.out.print("5");
        else if (grade >= 90)
            System.out.print("5");
        else if (grade >= 80)
            System.out.print("4");
        else if (grade >= 70)
            System.out.print("3");
        else if (grade >= 60)
            System.out.print("2");
        else if (grade >= 50)
            System.out.print("1");
        else if (grade >= 0)
            System.out.print("failed");
        else if (grade <= 0)
            System.out.print("impossible!");

    }
}
