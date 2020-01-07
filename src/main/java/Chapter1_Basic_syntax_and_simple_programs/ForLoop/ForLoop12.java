import java.util.Scanner;

/**
 * The for-loop → Arithmetic average
 * Write a program that reads two numbers a and b from the keyboard and calculates
 * and outputs to the console the arithmetic average of all numbers from the interval [a;b],
 * which are divisible by 3.
 * In the example below, the arithmetic average is calculated for the numbers on the interval [−5;12].
 * Total numbers divisible by 3 on this interval 6: -3, 0, 3, 6, 9, 12. Their arithmetic average equals to 4.5
 * The program input contains intervals, which always contain at least one number, which is divisible by 3.
 */
public class ForLoop12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        float sum = 0.0f;
        float count = 0.0f;
       float res = 0.0f;
        for(int i=a; i<=b; i++){
            if (i%3==0){
                sum = sum + i;
                count = count +1;
            }

        }
        System.out.println(sum/count);
        System.out.println(count);
        res = sum/count;
        System.out.println(res);
    }
}
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.println(avg);
    }
 */