package Chapter7_ExceptionHandling.ExceptionHandling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Exception handling → Converting and multiplying
 * Your task is to write a program that reads a sequence of strings and converts them
 * to integer numbers, multiplying by 10.
 * Some input strings may have an invalid format, for instance: "abc".
 * The sequence’s length may be different. It’s ending is indicated by “0”.
 * Zero serves as a stop character and should not be included in the sequence.
 * <p>
 * If a string can be converted to an integer number, output the number multiplied by 10.
 * Otherwise, output the string "Invalid user input: X" where X is the input string.
 * To better understand see examples below.
 * <p>
 * To implement this logic, use the exception handling mechanism.
 * <p>
 * Input data format:
 * A sequence of integer numbers and other strings, each in a new line
 * <p>
 * Output data format:
 * A sequence of integer numbers and warnings, each in a new line
 * <p>
 * Sample Input 1:
 * 11
 * 12
 * 13
 * 0
 * Sample Output 1:
 * 110
 * 120
 * 130
 * Sample Input 2:
 * 11
 * abc
 * 13
 * 0
 * Sample Output 2:
 * 110
 * Invalid user input: abc
 * 130
 */
public class ExceptionHandling5 {
    public static void main(String[] args) {
        // put your code here
        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String line = "";
        while (sc.hasNext()) {
            //          line = sc.nextLine();
            line = sc.next();
            if (line.equals("0")) {
                break;
            } else {
                list.add(line);
                System.out.println(list.size());
                System.out.println(list.toString());

            }

        }
        String value = "";

            for (int i = 0; i < list.size(); i++) {
                value = String.valueOf(list.get(i));

                try {
                int intValue = Integer.parseInt(String.valueOf(list.get(i)));
                    int res = intValue * 10;
                    System.out.println(res);
                } catch (NumberFormatException e) {
                  //  e.printStackTrace();
                 //   System.out.println("Invalid user input " + e.getMessage());
                    System.out.println("Invalid user input: " + value);

                }



            }


    }
}
/*
import java.util.Scanner;

class ExceptionExample {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String line = null;
            try {
                line = scanner.nextLine();
                int val = Integer.parseInt(line);

                if (val == 0) {
                    break;
                }

                System.out.println(val * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + line);
            }
        }
    }
}
 */