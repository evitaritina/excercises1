import java.util.Arrays;
import java.util.Scanner;

/**
 * Iterating over arrays → The maximum pairwise product
 * Write a program that reads an array of ints and outputs the maximum pairwise product in the given array of non-negative numbers.
 * If the array has only one element then output the element.
 * <p>
 * Input data format
 * The first line of the input contains the number of elements in the array.
 * The second line contains the elements of the array separated by spaces.
 * The array always has at least one element.
 */
public class IteratingOverArrays13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int res = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        if (size == 1) {
            res = array[0];

        } else {
            res = array[size - 2] * array[size - 1];
        }

        System.out.println(res);
    }

}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int maxProduct = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }

        System.out.println(maxProduct);
    }
 */