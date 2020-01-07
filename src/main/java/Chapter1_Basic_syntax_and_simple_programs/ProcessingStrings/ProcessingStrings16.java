import java.util.Scanner;

/**
 * Processing strings → The number of times two chars occur in a string
 * Write a program that takes a string and two characters from the standard input and
 * then prints the number of time the two characters occur consecutively in the string (in any order).
 * <p>
 * Input data format
 * The single input line contains a string and two characters.
 * Sample Input 1: abcd b c
 * Sample Output 1:  1
 * Sample Input 2:  bcbc c b
 * Sample Output 2:  3
 */
public class ProcessingStrings16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        String text = inputArray[0];
        String pattern1 = inputArray[1].substring(0, 1) + inputArray[2].substring(0, 1);
        String pattern2 = inputArray[2].substring(0, 1) + inputArray[1].substring(0, 1);

        String text1 = text;
        int index1 = text1.indexOf(pattern1);

        while(index1!=-1){
            counter1 = counter1 +1;
            text1 = text1.substring(index1+1);
            index1 = text1.indexOf(pattern1);
        }

        String text2 = text;
        int index2 = text.indexOf(pattern2);
        while(index2!=-1){
            counter2 = counter2 +1;
            text2 = text2.substring(index2+1);
            index2 = text2.indexOf(pattern2);
        }

        counter = counter1 + counter2;
        if(pattern1.contains(pattern2)){
            counter = counter1;
        }

        System.out.println(counter);
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();
        char ch1 = scanner.next().charAt(0);
        char ch2 = scanner.next().charAt(0);

        int count = 0;
        for (int i = 1; i < line.length(); i++) {
            if (ch1 == line.charAt(i - 1) && ch2 == line.charAt(i) || ch2 == line.charAt(i - 1) && ch1 == line.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
 */