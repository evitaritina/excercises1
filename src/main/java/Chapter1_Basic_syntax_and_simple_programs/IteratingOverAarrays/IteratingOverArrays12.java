import java.util.Scanner;

/**
 * Iterating over arrays → The index of the first max in an array
 * Write a program that read an array of ints and finds the index of the first maximum in an array.
 *
 * Input data format
 * The first line contains the number of elements in the array.
 * The second line contains the array elements separated by spaces.
  * An array always has at least one element.
 *
 * Output data format
 * Only a single integer value - the index of the first maximum.
 */
public class IteratingOverArrays12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int index = 0;

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int    max = array[0];
        for(int j = 1; j < size; j++){

            if(array[j] > array[j-1] && array[j] > max){
    max = array[j];
                index = j;
            }
        }
        System.out.println(index);

    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array = new int[length];
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
 */