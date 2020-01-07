import java.util.ArrayList;
import java.util.Scanner;

/**
 * Branching statements → The (un)-ordered sequence
 * Typical task for a job interview.
 * Write a program that reads a sequence of integer numbers and outputs true if the sequence is ordered
 * (in ascending or descending order), otherwise, false. Keep in mind,
 * if a number has the same value as the following number, it does not break the order.
 * <p>
 * The sequence ends with 0. Do not consider this number as a part of the sequence. The sequence always has at least one number (excluding 0).
 */
public class BranchingStatements5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        int num;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        int i = list.get(0);
        for (int e : list) {
                if (i < e || i == e) {
                res = true;
                i = e;
            } else {
                res = false;
                break;
            }
        }

        if (res == false) {
            int j = list.get(0);
            for (int f : list) {
                 if (j > f || j == f) {
                    res = true;
                    j = f;
                } else {
                    res = false;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
/*
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long old;

        boolean rordered = true;
        boolean lordered = true;

        while (true) {
            old = num;
            num = sc.nextLong();

            if (num == 0) {
                break;
            }

            if (rordered && num < old) {
                rordered = false;
                continue;
            }

            if (lordered && num > old) {
                lordered = false;
                continue;
            }

            if (!rordered && !lordered) {
                break;
            }
        }

        System.out.println(lordered || rordered);
    }
 */
