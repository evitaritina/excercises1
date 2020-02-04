package Chapter7_ExceptionHandling.ThrowingExceptions;
/**
 * Java → Throw a checked exception
 * Modify the given method. It should throw a checked exception.
 */
public class ThrowingExceptions5 {
    public static void method() throws RuntimeException, Exception {
        // write your code here
        //    Exception e = new Exception;
        throw new Exception();
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

/* import java.io.*;

public class Main {

    public static void method() throws Exception {
        throw new IOException();
    }

    // Do not change code below
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