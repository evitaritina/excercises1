package Chapter7_ExceptionHandling.ThrowingExceptions;
import java.io.IOException;

/**
 * Java → Throw an IOException

 * Modify the given method. It should throw an IOException.
 */
public class ThrowingExceptions10 {
    // change this method
    public static void method() throws IOException {
        throw new IOException();

    }

    /* Do not change code below */
    public static void main(String args[]) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}