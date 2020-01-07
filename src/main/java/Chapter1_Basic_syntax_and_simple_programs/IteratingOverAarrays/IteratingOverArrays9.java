import java.util.Scanner;

/**
 * Iterating over arrays → The sum of array elements
 * Write a program that calculates the sum of the elements of an array of ints.
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 * The sum of the input array elements.
 */
public class IteratingOverArrays9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for(int i = 0; i < size; i++){
         array[i] = scanner.nextInt();
         sum = sum + array[i];
        }
        System.out.println(sum);

    }
}
/*
 public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);
    }
 */