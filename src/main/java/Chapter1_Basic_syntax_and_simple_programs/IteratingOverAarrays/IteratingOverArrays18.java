import java.util.Scanner;
/**
 * Iterating over arrays → Cyclically shifting elements
 * Write a program that reads an array of ints named A and cyclically shift the elements of the array to the right:
 * A[0] goes to the place of A[1], A[1] - to the place of A[2], ..., and the last element goes to the place of A[0]).
 *
 * Input data format
 * The first line of the input contains the number of elements in the array. The second line – the elements of the array.
 *
 * Output data format
 * The single line contains all shifted elements of the array. Elements must be separated by the space character.
 */
public class IteratingOverArrays18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int a = array[size-1];
        for (int j = size-1; j >=0 ; j--) {
            if (j == 0) {
                array[j] = a;
            } else {
                array[j] = array[j - 1];
            }
        }
        for(int el: array){
            System.out.print(el+ " ");
        }
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            newArray[(i + 1) % size] = array[i];
        }

        for (int elem : newArray) {
            System.out.print(elem + " ");
        }
    }
 */