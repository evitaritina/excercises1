import java.util.Arrays;
import java.util.Scanner;

/**
 * Iterating over arrays → Two numbers never occur to each other
 * Write a program that reads an array of integers and two numbers n and m.
 * The program must check that n and m never occur next to each other (in any order) in the array.
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 *
 * Output data format
 * The result is a single value - true, if n and m never occur to each other, otherwise, false.
 */
public class IteratingOverArrays4 {
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array = new int[size];
        int n;
        int m;

       boolean yes = true;
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        n = scanner.nextInt();
        m = scanner.nextInt();

       // System.out.println(Arrays.toString(array));
        for(int j = 1; j<array.length; j++){
            if ((array[j] == n && array[j-1] == m ) || (array[j] == m && array[j-1] == n)){
                yes = false;
                break;
            }
        }
        System.out.println(yes);
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
        final int m = scanner.nextInt();

        boolean neverOccur = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                neverOccur = false;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                neverOccur = false;
                break;
            }
        }

        System.out.println(neverOccur);
    }
 */
