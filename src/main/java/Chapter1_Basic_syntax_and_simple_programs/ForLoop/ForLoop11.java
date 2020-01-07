import java.util.Scanner;

/**
 * The for-loop → The roots of an equation
 * The roots of a cubic equation
 * Given the numbers a, b, c, d. Output in ascending order all the integers between 0 and 1000
 * which are the roots of the equation ax^3+bx^2+cx+d=0
 * If the specified interval does not contain the roots of the equation, do not output anything.
 */
public class ForLoop11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();
    for(int i=0; i<=1000; i++){
        if (a*i*i*i + b*i*i +c*i +d==0){
            System.out.println(i);
        }
    }
    }
}
/*
public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();

        for (long x = 0, count = 0; x <= 1000 && count < 4; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count += 1;
            }
        }
    }
 */