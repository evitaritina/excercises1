import java.util.Arrays;
import java.util.Scanner;

public class ForLoop6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("sequence elements count: " +num);
        int[] array = new int[num];
        int sum = 0;
        //    int i=0;
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("array: " + Arrays.toString(array));
        for (int el : array){
            if (el%3==0 && el%2==0){
                sum = sum + el;
            }
        }
        System.out.println(sum);

    }


}

 /*   public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final int len = scanner.nextInt();
        int sum = 0;

        for (int i = 0, n; i < len; i++) {
            n = scanner.nextInt();
            sum += (n % 6 == 0) ? n : 0;
        }

        System.out.println(sum);
    }*/