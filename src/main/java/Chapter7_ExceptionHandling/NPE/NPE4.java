package Chapter7_ExceptionHandling.NPE;
import java.util.Scanner;

/**
 * Java → Exception handling → NPE
 * Java → Avoid NPE
 * Here's a program that may throw NullPointerException. Fix it to avoid the exception.
 *
 * In the case when the exception may occur, the program should print the string "NPE!".
 */
public class NPE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        try{
            System.out.println(string.toLowerCase());
        } catch (NullPointerException e){
            System.out.println("NPE!");
        }

    }
}
/*
class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        // Do not change code above

        if (string == null) {
                System.out.println("NPE!");
                } else {
                System.out.println(string.toLowerCase(Locale.ENGLISH));
                }
                }
                }
 */