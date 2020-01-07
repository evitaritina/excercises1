import java.util.Scanner;

/**
 * Processing strings → Convert a date
 * Write a program that takes a date string formatted as YYYY-MM-DD as input, then converts and outputs it as MM/DD/YYYY.
 *
 * For instance, the input 2007-07-21 will result in the following output 07/21/2007.
 *
 * The program must print "Incorrect input" if the date is not possible.
 * Assume that every month has 31 days and that the year, month or day cannot be 0 (or 00).
 * Sample Input 1: 2012-09-28
 * Sample Output 1: 09/28/2012
 */
public class ProcessingStrings20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean correct = true;
        String [] arr = null;
        arr = input.split("-");

        if (Integer.parseInt(arr[1]) < 01 || Integer.parseInt(arr[1])>12 || Integer.parseInt(arr[2]) < 01 || Integer.parseInt(arr[2])>31){
            correct = false;
        }

        String res = arr[1]+"/"+arr[2]+"/"+arr[0];
        String error = "Incorrect input";



        String result = correct == true ? res : error;
        System.out.println(result);


    }
}
/*
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();

        try {
            LocalDate.parse(date);
            String[] line = date.split("-");
            System.out.println(line[1] + "/" + line[2] + "/" + line[0]);
        } catch (DateTimeException e) {
            System.out.println("Incorrect input");
        }
    }
}
 */