package lv.riga.learning.java.HeadFirstJAVA_2Edition_book.chapter5;

import java.util.Scanner;

/**
 * Iterating over arrays → Right Rotation
 * A right rotation is an operation which shifts each element of the array to the right.
 * <p>
 * For example, if a right rotation is 1 and array is {1,2,3,4,5}, the new array will be {5,1,2,3,4}.
 * <p>
 * Another example, if a right rotation is 2 and array {1,2,3,4,5}, the new array will be {4,5,1,2,3}, because
 * <p>
 * {1,2,3,4,5} ->  {5,1,2,3,4} ->  {4,5,1,2,3}.
 */
public class IteratingOverArrays19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 1;
        int rotation = 0;
        int rotationTotal = 0;
        String string = "";

        string = scanner.nextLine();
//        System.out.println(" String: " + string);

        rotation = scanner.nextInt();
//        System.out.println(" rotation: " + rotation);
        String[] array = string.split(" ");
        size = array.length;
        //      for (String el : array) {
        //           System.out.print(el + " ");
        //       }

        if (rotation > size) {
            rotationTotal = rotation % size;
        } else {
            rotationTotal = rotation;
        }
        //       System.out.println("rotationTotal: " + rotationTotal);

        for (int z = 1; z <= rotationTotal; z++) {
            String a = array[size - 1];
            for (int j = size - 1; j >= 0; j--) {
                if (j == 0) {
                    array[j] = a;
                } else {
                    array[j] = array[j - 1];
                }
            }
        }

        for (String el : array) {
            System.out.print(el + " ");
        }

    }
}