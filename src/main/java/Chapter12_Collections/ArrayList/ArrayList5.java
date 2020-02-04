package Chapter12_Collections.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Java → Collections → ArrayList
 * Java → Find the nearest number
 * Given a sequence of integers, and a number N, find out the closest integer from the array to the N.
 * If you find several integers with the same distance to the N, you should output all of them in the ascending order.
 * Sample Input 1:
 * 1 2 4 5
 * 3
 * Sample Output 1:
 * 2 4
 * Sample Input 2:
 * 1 2 3 4
 * 6
 * Sample Output 2:
 * 4
 * Sample Input 3:
 * 5 1 3 3 1 5
 * 4
 * Sample Output 3:
 * 3 3 5 5
 */
public class ArrayList5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String integers = sc.nextLine();
        List<Integer> list = new ArrayList<Integer>();
        List res = new ArrayList();
        for (String s : integers.split("\\s")) {
            list.add(Integer.parseInt(s));
        }
        list.toArray();

        int num = sc.nextInt();
        int iterator = 0;

        while (res.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                //   System.out.println ("list.get " + i+ ": " +list.get(i));
                if (num + iterator == list.get(i) || num - iterator == list.get(i)) {
                    res.add(list.get(i));
                    Collections.sort(res);
                    //   System.out.print(res.toString());
                    //    System.out.print(Arrays.deepToString(res.toArray()));

                }
                // System.out.print(Arrays.deepToString(res.toArray()));


            }
            //   System.out.print(Arrays.deepToString(res.toArray()));
            iterator++;
            //  System.out.println(res.toString());

        }
        //   System.out.print(Arrays.deepToString(res.toArray()));
        //   System.out.print(res.toString());
        //   System.out.print(res);
        for (int z = 0; z < res.size(); z++) System.out.print(res.get(z) + " ");


    }


}

/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String item : items) {
            numbers.add(Integer.parseInt(item));
        }

        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        int delta = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (Math.abs(i - n) < delta) {
                delta = Math.abs(i - n);
                result.clear();
                result.add(i);
            } else if (Math.abs(i - n) == delta) {
                result.add(i);
            }
        }

        Collections.sort(result);

        for (int item : result) {
            System.out.print(item + " ");
        }
    }
}
 */