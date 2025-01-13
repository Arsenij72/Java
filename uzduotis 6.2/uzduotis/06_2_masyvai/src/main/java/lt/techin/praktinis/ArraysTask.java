package lt.techin.praktinis;

import java.util.stream.IntStream;

public class ArraysTask {


    public static void main(String[] args) {
        // Įgyvendikite visus metodus (turi pažaliuoti unit testai)
        // Pateiktas masyvas ir pavyzdys programos patikrinimui. Masyvo elementų reikšmes galite keisti.

        int[] arr = {3, 2, 1, 4, 6, 5};

        int minMark = getMin(arr);

        System.out.printf("Min mark: %d\n", minMark);
        getFirstElement(arr);
        getLastElement(arr);
        getMin(arr);
        getMax(arr);
        getSum(arr);
    }

    //Metodas turi grąžinti pirmą masyvo elementą
    public static int getFirstElement(int[] arr) {
        int first = arr[0];
        System.out.printf("First element: %d\n", first);
        return 0;
    }

    //Metodas turi grąžinti paskutinį masyvo elementą
    public static int getLastElement(int[] arr) {
        int last = arr[arr.length - 1];
        System.out.printf("Last element: %d\n", last);
        return 0;
    }

    //Raskite mažiausią masyvo elementą
    public static int getMin(int[] arr) {
        int min = IntStream.of(arr).min().getAsInt();
        System.out.printf("Min element: %d\n", min);

        return 0;
    }

    //Raskite didžiausią masyvo elementą
    public static int getMax(int[] arr) {
        int max = IntStream.of(arr).max().getAsInt();
        System.out.printf("Max element: %d\n", max);
        return 0;
    }

    //Suskaičiuokite masyvo elementų sumą
    public static int getSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            System.out.printf("Total: %d\n", total);
        }
        return 0;
    }

    //Raskite masyvo elementų vidurkį
    public static int getAverage(int[] arr) {
        //TODO
        return 0;
    }


    //Suskaičiuokite kiek masyve yra skaičių, didesnių nei duotas skaičius n
    public static int countElements(int[] arr, int n) {
        //TODO
        return 0;
    }

    //Metodas turi grąžinti true, jei masyve yra elementas kurio reikšmė lygi n
    public static boolean contains(int[] arr, int n) {
        //TODO
        return false;
    }

    //Raskite elemento kurio reikšmė lygi n paskutinį indeksą
    public static int lastIndexOf(int[] arr, int n) {
        //TODO
        return 0;
    }


}
