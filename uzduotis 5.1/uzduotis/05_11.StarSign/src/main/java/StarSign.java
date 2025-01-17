

public class StarSign {

    public static void main(String[] args) {

        printStars(5);

        printStars(3);

        printStars(9);
        System.out.println("\n---");

        printSquare(4);
        System.out.println("\n---");
        System.out.println("");

        printRectangle(17, 3);
        System.out.println("");
        System.out.println("\n---");

        printTriangle(4);
        System.out.println("\n---");


    }


    public static void printStars(int number) {

        for (int counter = 0; counter < number; counter++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int counter = 1; counter <= size; counter++) {
            printStars(size);

        }
    }

    public static void printRectangle(int width, int height) {
        for (int counter = 1; counter <= width; counter++) {
            printStars(width);
            System.out.print("");
            if (counter == height) {
                break;
            }
        }
    }

    public static void printTriangle(int size) {
        int counter = 0;
        while (counter <= size) {
            printStars(counter);
            System.out.print("");
            counter++;
        }
    }
}




