import java.util.Scanner;

/**
 * Iterating over arrays → Count how many times a number occurs
 * Write a program that read an array of ints and an integer number n.
 *
 * The program must check how many times n occurs in the array.
 *
 * Input data format
 * The first line contains the size of the input array.
 * The second line contains elements of the array separated by spaces.
 * The third line contains n.
 *
 * Output data format
 * The result is only a single non-negative integer number.
 */
public class IteratingOverArrays8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int size = scanner.nextInt();
        int[] array = new int[size];
        int n;
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        for(int j = 0; j < size; j++){
            if (array[j] == n){
                counter++;
            }

        }
        System.out.println(counter);
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
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }

        System.out.println(count);
    }
 */