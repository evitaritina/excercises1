import java.util.Scanner;

/**
 * Iterating over arrays → Sum array elements greater than a value
 * Write a program that reads an array of ints and an integer number n.
 * The program must sum all the array elements greater than n.
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 * The third line contains the number n.
 *
 * Output data format
 * Only a single number representing the sum.
 */
public class IteratingOverAarrays10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for(int j = 0; j < size; j++){
            if(array[j] > n){
                sum = sum + array[j];
            }
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

        final int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > n) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
 */