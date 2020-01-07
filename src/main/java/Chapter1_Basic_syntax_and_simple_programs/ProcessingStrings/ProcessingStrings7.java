import java.util.Scanner;

/**
 * Processing strings → The lucky ticket
 * Paul loves to ride public transport and after receiving the ticket, he immediately checks whether he got the lucky one.
 * A ticket is considered a lucky one if the sum of the first three numbers in this ticket matches the sum of the last three numbers in the same ticket.
 *
 * However, Paul does not count well in his head. That is why he asks you to write the program, which will check
 * the equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.
 *
 * A string of six digits is provided as input to the program.
 * You need to print out only the word "Lucky" or "Regular" with a capital letter (without quotes).
 *
 * Sample Input 1: 090234
 * Sample Output 1: Lucky
 * Sample Input 2: 123456
 * Sample Output 2: Regular
 */
public class ProcessingStrings7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String[] array1 = number.split("");
        int size = array1.length;
        int sum1 =  Integer.parseInt(array1[0]) + Integer.parseInt(array1[1]) + Integer.parseInt(array1[2]);
        int sum2 = Integer.parseInt(array1[size-3]) + Integer.parseInt(array1[size-2]) + Integer.parseInt(array1[size-1]);
        if(sum1 == sum2){
            System.out.println("Lucky");
        } else{
            System.out.println("Regular");
        }

    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num = scanner.next();
        int middle = num.length() / 2;
        String part1 = num.substring(0, middle);
        String part2 = num.substring(middle);

        int part1sum = 0;
        for (Character part1char : part1.toCharArray()) {
            part1sum += Integer.valueOf(part1char.toString());
        }

        int part2sum = 0;
        for (Character part2char : part2.toCharArray()) {
            part2sum += Integer.valueOf(part2char.toString());
        }

        if (part1sum == part2sum) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
 */