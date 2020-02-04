package Chapter7_ExceptionHandling.ThrowingExceptions;
import java.util.Scanner;

/**
 * Java → Days of the week
 * Your task is to implement the getDayOfWeekName method that converts the number of the day of the week to its short name.
 * If the given number is incorrect, the method should throw IllegalArgumentException.
 *
 * Let's assume that a week starts from Monday:
 *
 * 1 → "Mon";
 * 2 → "Tue";
 * 3 → "Wed";
 * 4 → "Thu";
 * 5 → "Fri";
 * 6 → "Sat";
 * 7 → "Sun".
 * Sample Input 1:
 * 0
 * Sample Output 1:
 * java.lang.IllegalArgumentException
 *
 * Sample Input 2:
 * 1
 * Sample Output 2:
 * Mon
 */
public class ThrowingExceptions11 {
    public static String getDayOfWeekName(int number)throws IllegalArgumentException {
        String res = "";
        // write your code here
        if(number<=0 || number >7){
            throw new IllegalArgumentException();
        } else{
            if(number == 1){return res = "Mon";}
            if(number == 2){return res = "Tue";}
            if(number == 3){return res = "Wed";}
            if(number == 4){return res = "Thu";}
            if(number == 5){return res = "Fri";}
            if(number == 6){return res = "Sat";}
            if(number == 7){return res = "Sun";}

        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}
/*
public class Main {

    public static String getDayOfWeekName(int number) {
        switch (number) {
            case 1: return "Mon";
            case 2: return "Tue";
            case 3: return "Wed";
            case 4: return "Thu";
            case 5: return "Fri";
            case 6: return "Sat";
            case 7: return "Sun";
            default:
                throw new IllegalArgumentException("Invalid day number: " + number);
        }
    }

    //* Do not change code below
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int dayNumber = scanner.nextInt();
    try {
        System.out.println(getDayOfWeekName(dayNumber));
    } catch (Exception e) {
        System.out.println(e.getClass().getName());
    }
}
}
 */