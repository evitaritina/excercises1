import java.util.Scanner;

/**
 * Iterating over arrays → Triples
 * Triples
 * Write a program that reads an array of ints and outputs the number of "triples" in the array.
 * A "triple" is three consecutive ints in increasing order differing by 1 (i.e. 3,4,5 is a triple, but 5,4,3 and 2,4,6 are not).
 * <p>
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * <p>
 * Output data format
 * Only a single integer value - the number of "triples".
 */
public class IteratingOverArrays17 {
    public static void main(String[] args) {

        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 2; j < size; j++) {

            if (array[j] - array[j - 1] == 1 && array[j - 1] - array[j - 2] == 1) {

                counter = counter + 1;
            }
        }
        System.out.println(counter);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[scanner.nextInt()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }

        int triples = 0;
        for (int i = 2; i < ints.length; i++) {
            if (ints[i] - ints[i - 1] == 1 && ints[i - 1] - ints[i - 2] == 1) {
                triples++;
            }
        }

        System.out.println(triples);
    }
*/