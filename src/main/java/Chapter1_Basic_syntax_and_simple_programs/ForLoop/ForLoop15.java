import java.util.Scanner;

/**
 * The for-loop → Size of parts
 * A detector compares the size of parts produced by a machine with the reference standard.
 *
 * If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
 * If the size of the part is smaller, it is removed as a reject, and the detector prints the number -1.
 * If the part is perfect, it is sent to the box with products, that are ready to ship, and the detector prints 0.
 *
 * Write a program, which takes the number of parts n as input, and then the sequence of detector prints.
 * The program should output numbers in a single line containing the number of parts ready to be shipped,
 * the number of parts to be fixed, and the number of rejects.
 */
public class ForLoop15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ready = 0;
        int fixed = 0;
        int rejected = 0;
        int n = scanner.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        for(int mark : array){
            if(mark==-1){
                rejected = rejected +1;
            } else if(mark==0){
                ready = ready + 1;
            } else if(mark==1){
                fixed = fixed +1;
            }
        }
        System.out.println(ready+ " "+fixed+" "+rejected);
    }
}
/*
public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        int amountOfLarger = 0;
        int amountOfSmaller = 0;
        int amountOfPerfect = 0;
        int size;

        for (int i = 0; i < n; i++) {
            size = scanner.nextInt();
            if (size == 1) {
                amountOfLarger++;
            } else if (size == -1) {
                amountOfSmaller++;
            } else {
                amountOfPerfect++;
            }
        }

        System.out.println(amountOfPerfect + " " + amountOfLarger + " " + amountOfSmaller);
    }
 */