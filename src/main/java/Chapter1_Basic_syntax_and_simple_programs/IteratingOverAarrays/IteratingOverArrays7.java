import java.util.Scanner;

/**
 * Iterating over arrays → Check if an array contains two numbers
 * Write a program that reads an unsorted array of integers and two numbers n and m.
 * The program must check if n and m occur next to each other in the array (in any order).
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array.
 * The third line contains two integer numbers n and m.
 * All numbers in the same line are separated by the space character.
 *
 * Output data format
 * Only a single value: true or false.
 */
public class IteratingOverArrays7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        int size = 0;

        size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for(int j = 1; j < size; j++){
            if(array[j] == n && array[j-1] == m || array[j] == m && array[j-1] == n){
                res = true;
                break;
            }

        }
        System.out.println(res);
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

        boolean found = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                found = true;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
 */