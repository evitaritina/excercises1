package Chapter7_ExceptionHandling.NPE;
import java.util.Locale;
import java.util.Scanner;

/**
 * Java → Exception handling  →  NPE
 * Java → Return empty string when argument is null
 * Take a look at the method that takes a string, converts all characters of the string to the upper case and then returns the resulting string.
 *
 * But there is a problem. Sometimes an input string is null. As you already know, in this case, the method throws NullPointerException.
 *
 * Your task is to fix the method in order to avoid NPE.
 *
 * If the input string is null, the method should return the empty string "".
 *
 * Sample Input 1:
 * a string
 * Sample Output 1:
 * A STRING
 */
public class NPE3 {
    /* Fix this method */
    public static String toUpperCase(String str) {
        if(str != null) {
            return str.toUpperCase(Locale.ENGLISH);
        } else {
            return str = "";
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
/*
public class Main {

    //Fix this method
public static String toUpperCase(String str) {
    return str == null ? "" : str.toUpperCase();
}

    // Do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        System.out.println(toUpperCase(line));
    }
}
 */