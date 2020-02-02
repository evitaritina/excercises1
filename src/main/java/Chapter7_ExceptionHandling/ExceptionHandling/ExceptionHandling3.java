package Chapter7_ExceptionHandling.ExceptionHandling;

import java.util.Scanner;

/**
 * Exception handling → String to double conversion
 * Consider a method that takes a string and converts it to a double.
 * If the input string happen to be null or of an unsuitable format, a runtime exception occurs and the program fails.
 *
 * Fix the method so it would catch any exceptions and return the default value 0 (zero) if an exception occurred.
 *
 * Sample Input 1:
 * 123.0
 * Sample Output 1:
 * 123.0
 * Sample Input 2:
 * 15.5
 * Sample Output 2:
 * 15.5
 */
public class ExceptionHandling3 {
    /**
     * It returns a double value or 0.0 if an exception occurred
     */
    public static double convertStringToDouble(String s) {
        try {
            double d = Double.parseDouble(s);
            return d;

        } catch (Exception e){
            return 0;
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        double result = convertStringToDouble(line);
        System.out.println(result);
    }
}
