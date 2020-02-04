package Chapter12_Collections.ArrayList;
import java.util.ArrayList;

/**
 * Java → Creating list
 * Create ArrayList by name list in any way known to you and fill it with the following four numbers 2, 0, 1, 7.
 * The code for displaying the list is already written.
 *
 * Sample Input 1:
 *
 * Sample Output 1:
 *
 * [2, 0, 1, 7]
 */
public class ArrayList10 {
    public static void main(String[] args) {
        String str = "2, 0, 1, 7";
        ArrayList list = new ArrayList();
        for (String s : str.split(", ")) {
            list.add(Integer.parseInt(s));
        }
        list.toArray();

        //write your code here


        System.out.println(list);
    }
}
/*
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(7);
        System.out.println(list);
    }
}
 */