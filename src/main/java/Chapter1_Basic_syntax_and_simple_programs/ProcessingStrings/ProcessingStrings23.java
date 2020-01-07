import java.util.Scanner;

/**
 * Processing strings → Create a euphonious word
 * All the letters of the English alphabet are divided into vowels and consonants.
 * The vowels are: a, e, i, o, u, y.
 * The remaining letters are consonants.
 * <p>
 * A word is considered euphonious if it has not three or more vowels or consonants in a row. Otherwise, it is considered discordant.
 * <p>
 * Your task is to create euphonious words from discordant. You can insert any letters inside word.
 * You should output the minimum number of characters needed to create a euphonious word from a given word.
 * <p>
 * For example, word "schedule" is considered discordant because it has three consonants in a row - "sch".
 * To create a euphonious word you need to add any vowel between 's' and 'c' or between 'c' and 'h'.
 * <p>
 * Sample Input 1: schedule
 * Sample Output 1: 1
 * Sample Input 2: garage
 * Sample Output 2: 0
 * Sample Input 3: player
 * Sample Output 3: 1
 * Sample Input 4: biiiiig
 * Sample Output 4: 2
 */
public class ProcessingStrings23 {

    private static final String vowels = "AaEeIiOoUuYy";
    private static final String consonants = "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxZz";

    public static void main(String[] args){
        int counter = 1;
        int euphonious = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputArray = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputArray[i] = input.charAt(i);
        }
        for(int i = 1; i <inputArray.length; i++){
            char result1 = inputArray[i-1];
            char result2 = inputArray[i];

            if (vowels.contains(String.valueOf(result1)) && vowels.contains(String.valueOf(result2)) || consonants.contains(String.valueOf(result1)) && consonants.contains(String.valueOf(result2))){
                counter = counter + 1;
            } else {
                if(counter >2) { euphonious = euphonious + (counter/2-1) + counter%2;}
                counter = 1;

            }

        }
        euphonious = euphonious + (counter/2-1) + counter%2;
        System.out.println(euphonious);


    }
}