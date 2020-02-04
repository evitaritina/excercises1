package Chapter12_Collections.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
 * Output each its element in the loop. Each element must be in new line.
 *
 * Sample Input 1:
 *
 * Sample Output 1:
 *
 * Mr.Green
 * Mr.Yellow
 * Mr.Red
 */
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        // write your code here


        for (String value : nameList) {
            System.out.println(value);
        }
    }
}
/*
 public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
        for (String item : nameList) {
            System.out.println(item);
        }
    }
 */