import java.util.Scanner;

/**
 * The while and do-while loops → The largest element of a sequence
 * Given the sequence of integer numbers (which ends with the number 0). Find the largest element of the sequence.
 *
 * The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
 */
public class WhileLoop11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max=0;
        int el;
        do{
            el = scanner.nextInt();
            if(el > max){
                max = el;
            }
        } while (el != 0);
        System.out.println(max);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int max = number;

        while (number != 0) {
            if (max < number) {
                max = number;
            }
            number = scanner.nextInt();
        }

        System.out.println(max);
    }
 */