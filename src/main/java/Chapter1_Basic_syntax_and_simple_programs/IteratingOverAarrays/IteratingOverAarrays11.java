import java.util.Scanner;

/**
 * Iterating over arrays → The minimum value of an array
 * Write a program that reads an array of integers and finds the minimum value of the array.
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 * An integer number representing the minimum in the input array.
 */
public class IteratingOverAarrays11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
       int min = array[0];
        for(int j = 1; j < size; j++){
            if(array[j] < min){
                min = array[j];
            }
        }
        System.out.println(min);
    }
}
/*
public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
 */