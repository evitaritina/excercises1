import java.util.Arrays;
import java.util.Scanner;

/**
 * Processing strings → Compression algorithm
 * Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the informatics group
 * suggested using a compression algorithm that compresses repeated characters in a string.
 * <p>
 * Encoding is performed as follows:
 * The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters
 * of the input string are replaced by the symbol and the number of its repetitions in this string.
 * <p>
 * Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence.
 * The encoding must be case sensitive.
 * <p>
 * Note, string can be empty or contain only a single character.
 * Sample Input 1: aaaabbcaa
 * Sample Output 1: a4b2c1a2
 * Sample Input 2: abc
 * Sample Output 2: a1b1c1
 */
public class ProcessingStrings18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String input = scanner.nextLine();
        System.out.println("String input: " + input);
        char[] array = input.toCharArray();
        System.out.println(" array: " + Arrays.toString(array));
        int counter = 0;
        String res = "";
        char ch;
        int size = array.length;
        System.out.println(size);
        if (size == 1) {
            System.out.println(array[0] + "" + 1);
        }

        for (int i = 1; i < size; i++) {
            counter = counter + 1;
            ch = array[i - 1];
            res = ch + "" + counter;
            //       System.out.println("iteration: " + i + "res: " +res);
            if (array[i] != array[i - 1]) {
                System.out.print(res);
                counter = 0;

            }
            if (array[i] == array[size - 1]) {

                res = (array[size - 1] == array[size - 2]) ? ch + "" + (counter + 1) : array[size - 1] + "" + 1;

            }

        }
        System.out.print(res);

    }

}
/*
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        char[] arrOfChar = str.toCharArray();
        arrOfChar[0] = str.charAt(0);
        int count = 1;
        String res = "";

        for (int i = 1; i < arrOfChar.length; i++) {
            if (arrOfChar[i] == arrOfChar[i - 1]) {
                count++;
            } else {
                res = res.concat(String.valueOf(arrOfChar[i - 1]));
                res = res.concat(String.valueOf(count));
                count = 1;
            }
        }

        res = res.concat(String.valueOf(arrOfChar[arrOfChar.length - 1]));
        res = res.concat(String.valueOf(count));

        System.out.println(res);
    }
 */