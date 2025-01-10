import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printFromNumberToOne(1);
        int i = scan.nextInt();

    }

    public static void printFromNumberToOne(int number) {
        for (int i = 5; i >= number; i--) {
            System.out.println(i);
        }
    }
}


