import java.util.Scanner;

/**
 * Iterating over arrays → Alphabetical order
 * Write a program that reads an array of strings and checks whether the array is in alphabetical order or not.
 * <p>
 * There are several rules to do it:
 * 1) You can compare chars with < to see if one comes before the other one (i.e. by comparing ASCII values).
 * 2) Shorter strings come before longer strings whenever the shorter string is a subset of the longer one. So, "a" comes before "abc".
 * 3) Finally, strings which are identical are in alphabetical order.
 * <p>
 * Input data format
 * The single input line contains strings separated by spaces.
 * <p>
 * Output data format
 * Only a single value - true or false.
 */
public class IteratingOverArrays15 {

    public static void main(String[] args) {
        boolean res = false;
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
//       System.out.println(string);
        String delims = "[ ]+";
        String[] array = string.split(delims);

        for (int i = 1; i < array.length; i++) {
            //   System.out.println(array[i]);

            int min = array[i].length() > array[i - 1].length() ? array[i - 1].length() : array[i].length();
            for (int j = 0; j < min; j++) {


                res = array[i].charAt(j) >= array[i - 1].charAt(j) && array[i - 1].length()<=min;

            }

        }
        System.out.println(res);
    }

}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split(" ");

        boolean alphabetical = true;
        String lastOne = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(lastOne) < 0) {
                alphabetical = false;
                break;
            }
            lastOne = arr[i];
        }

        System.out.println(alphabetical);
    }
*/
