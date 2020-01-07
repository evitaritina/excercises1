import java.util.Scanner;

/**
 * Iterating over arrays → The longest ascending sequence
  * Write a program that reads an array of ints and outputs the length of the longest sequence in ascending order.
 * Elements of the sequence must go one after another.
 *
 * Input data format
 * The first line contains the size of an array.
 * The second line contains elements of the array separated by spaces.
 *
 * Example
  * The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5.
 * It includes the following elements: 1 2 3 5 7.
 */
public class IteratingOverArrays14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        int counter = 1;
        int max = 1;
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
       for(int j = 1; j < size; j++){

           if(array[j]>=array[j-1]){
               counter = counter +1;
               if(counter>= max){
                   max = counter;
               }
           } else {
               counter = 1;
           }
   //        System.out.println(counter);
       }
        System.out.println(max);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = 1;
        for (int i = 1; i < n; i++) {
            int best = 1;
            while (i < n && arr[i] > arr[i - 1]) {
                best++;
                i++;
            }
            max = Math.max(max, best);
        }

        System.out.println(max);
    }
 */