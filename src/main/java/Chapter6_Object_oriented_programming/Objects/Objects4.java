package Chapter7;
import java.util.Scanner;
/**
 * Objects → Preparing full name
 * Code Challenge — Write a program
 * Implement a function for preparing full name. The function takes two string arguments: firstName and lastName.
 * You need to concat them together with a space in the middle.
 *
 * If an argument is null then do not add it and a space to the full name.
 *
 * Sample Input 1:
 * Joseph
 * Brown
 * Sample Output 1: Joseph Brown
 * Sample Input 2:
 * Joseph
 * null
 * Sample Output 2: Joseph
 */

public class Objects4 {
    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        if(lastName==null){
            return firstName;
        } else if(firstName == null && lastName ==null){
            return null;
        } else if(firstName == null){
            return lastName;
        }
        return firstName+ " " +lastName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}
/*
public static String prepareFullName(String firstName, String lastName) {
        String fullName = "";

        if (firstName != null) {
            fullName += firstName + " ";
        }

        if (lastName != null) {
            fullName += lastName;
        }

        return fullName.trim();
    }
 */