package Chapter7_ExceptionHandling.ThrowingExceptions;
/**
 * Java → Throw an unchecked exception
 *
 *         Code Challenge — Write a program
 *         Modify the given method.
 *
 *         It should throw an unchecked exception.
 */
public class ThrowingExceptions3 {

    public static void method() {
        // write your code here
        int res = 3/0;
    }

    /* Do not change code below */
    public static void main(String args[]) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

/*


public class Main {

    public static void method() {
        throw new RuntimeException();
    }

    public static void main(String args[]) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}

*/
