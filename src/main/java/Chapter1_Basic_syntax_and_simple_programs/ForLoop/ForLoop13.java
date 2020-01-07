import java.util.Scanner;

/**
 * The for-loop → Grades
 * Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in a class consisting of n students.
 * The program gets number n as input, and then gets the grades themselves (one by one).
 * The program should output four numbers in a single line - the number of "D", the number of "C",
 * the number of "B" and the number of "A" grades.
 */
public class ForLoop13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for(int mark : array){
            if(mark==2){
                d = d +1;
            } else if(mark==3){
                c = c + 1;
            } else if(mark==4){
                b = b +1;
            } else if(mark==5){
                a = a + 1;
            }
        }
        System.out.println(d+ " "+c+" "+b+" "+a);
    }
}
/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] grades = new int[4];

        for (int i = 0; i < n; i++) {
            grades[scanner.nextInt() - 2]++;
        }

        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
    }
 */