import java.util.Scanner;

/**
 * Iterating over arrays → Does an array contain N?
 * Write a program that reads an array of integers and an integer.
 * The program must check if the array contains that number.
 * <p>
 * Input data format
 * The first line: the size of an array.
 * The second line: all the elements of the array separated by the space.
 * The third line: one integer.
 * <p>
 * Output data format
 * Only a single value: true or false.
 */
public class IteratingOverArrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        String res = "";
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();

        }
        //   System.out.println(Arrays.toString(array));
        int n = scanner.nextInt();
        for (int el : array) {
            if (el == n) {
                res = "true";
                break;
            } else {
                res = "false";
            }
        }
        System.out.println(res);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();
        boolean contains = false;

        for (int i = 0; i < numbers.length && !contains; i++) {
            if (numbers[i] == num) {
                contains = true;
            }
        }

        System.out.println(contains);
    }
 */