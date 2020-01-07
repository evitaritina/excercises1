import java.util.Scanner;

/**
 * The while and do-while loops → Squares of natural numbers
 * Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.
 */
public class WhileLoop4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        while(num*num<=n){
            System.out.println(num *num);
            num= num +1;
        }

            }
}
/*
public static void main(String[] args) {
        final int MAXIMUM = new Scanner(System.in).nextInt();

        int counter = 1;
        int square;

        while ((square = counter * counter++) <= MAXIMUM) {
            System.out.println(square);
        }
    }
 */