import java.util.Scanner;

/**
 * The while and do-while loops → The length of the sequence
 * For its input, the program gets a sequence of non-negative integers;
 * each integer is written in a separate line. The sequence ends with an integer 0;
 * when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).
 *
 * Don’t read numbers following the number 0.
 */

public class WhileLoop3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do{
            num = scanner.nextInt();
            sum ++;
        } while (0 != num);
        System.out.println(sum-1);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), count = 0;

        while (num != 0) {
            num = scanner.nextInt();
            count++;
        }

        System.out.println(count);
    }
 */