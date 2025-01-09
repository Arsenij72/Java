

public class FromParameterToOne {

    public static void printFromNumberToOne(int number) {
        for (int i = 2; i >= number; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printFromNumberToOne(1);

    }
}
