import java.util.Scanner;

/**
 * Iterating over arrays → Check if an array is sorted ascending

 * Write a program that reads an array of int's and checks the array is sorted ascending (from smallest to largest number).
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Output data format
 * Only a single value: true or false.
 */
public class IteratingOverArrays16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean result = true;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        for(int j = 1; j<size; j++){
            result = array[j] >= array[j-1]? true :false;
            if (result == false){break;}
        }
        System.out.println(result);
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

        boolean asc = true;

        for (int i = 0; i < numbers.length - 1 && asc; i++) {
            if (numbers[i] > numbers[i + 1]) {
                asc = false;
            }
        }

        System.out.println(asc);
    }
*/