import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Processing strings → Generating passwords
 * The password is hard to crack if it contains
 * at least A uppercase letters, at least B lowercase letters, at least C digits and includes exactly N symbols.
 * Also, a password cannot contain two or more same characters coming one after another.
 * For a given numbers A, B, C, N you should output password that matches these requirements.
 * Sample Input 1: 3 4 1 8
 * Sample Output 1: PaSsw0rD
 */
public class ProcessingStrings21 {
    private static SecureRandom random = new SecureRandom();
    /** different dictionaries used */
    private static final String letterCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String letterLower = "abcdefghijklmnopqrstuvwxyz";
    private static final String number = "0123456789";
    String password = "";
//    String shufflePasswordString = shuffleString(password);

    public static String generatePassword(int len, String dic) {
        String result = "";
        for (int i = 0; i < len; i++) {
            int index = random.nextInt(dic.length());
            result += dic.charAt(index);
        }
        return result;
    }

    public static String shuffleString(String shufflePasswordString) {
        List<String> letters = Arrays.asList(shufflePasswordString.split(""));
        Collections.shuffle(letters);
        return letters.stream().collect(Collectors.joining());
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int d = n - (a+ b + c);
        System.out.println(a + " " + b + " " + c + " " + n);

        System.out.println("Password Generator Examples");
        System.out.println();

        int len = a;
        System.out.println("letterCapital " + len + " chars: ");
        String passwordA = generatePassword(len, letterCapital);
        System.out.println(passwordA);
        System.out.println();

        len = b;
        System.out.println("letterLower, length " + len + " chars: ");
        String passwordB = generatePassword(len, letterLower);
        System.out.println(passwordB);
        System.out.println();

        len = c;
        System.out.println("number " + len + " chars: ");
        String passwordC = generatePassword(len, number);
        System.out.println(passwordC);
        System.out.println();

        len = d;
        System.out.println("number " + len + " chars: ");
        String passwordD = generatePassword(len, letterCapital + letterLower + number);
        System.out.println(passwordD);
        System.out.println();

        String password = passwordA + passwordB + passwordC + passwordD;
        System.out.println(password);
        String shafflePassword = shuffleString(password);
        System.out.println(shafflePassword);

        char[] ch = new char[shafflePassword.length()];
        // Copy character by character into array
        for (int i = 0; i < shafflePassword.length(); i++) {
            ch[i] = shafflePassword.charAt(i);
        }

        for(int i = 1; i < ch.length; i++){
            if(ch[i] == ch[i-1]){
                char result = ch[i];
                if(letterCapital.contains(String.valueOf(result))) {
                    String letterCapitaltemp = letterCapital.replace(String.valueOf(result), "");
                    int index = random.nextInt(letterCapitaltemp.length());
                    ch[i] = letterCapitaltemp.charAt(index);
                }
                if (letterLower.contains(String.valueOf(result))){
                    String letterLowerTemp = letterLower.replace(String.valueOf(result), "");
                    int index = random.nextInt(letterLowerTemp.length());
                    ch[i] = letterLowerTemp.charAt(index);
                }
                if (number.contains(String.valueOf(result))){
                    String numberTemp = number.replace(String.valueOf(result), "");
                    int index = random.nextInt(numberTemp.length());
                    ch[i] = numberTemp.charAt(index);
                }


            }
        }
        String res = String.copyValueOf(ch);
        System.out.println(res);
    }

}