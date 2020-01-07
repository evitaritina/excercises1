import java.util.Scanner;

/**
 * Processing strings → Parse url
 * You want to hack a website and get all available parameters. Print them "key : value".
 * If you find the password (parameter pass), you should print it after all parameters like in the sample.
 * If a parameter doesn't have value print "not found".
 * <p>
 * Note: the order of parameters should like as in the url.
 * If a url does not contain parameter pass, do not print anything after parameters
 * <p>
 * Advice: learn the structure of URL.
 * <p>
 * Sample Input 1:
 * <p>
 * hts://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost
 * Sample Output 1:
 * <p>
 * pass : 12345
 * port : 8080
 * cookie : not found
 * host : localhost
 * password : 12345
 */
public class ProcessingStrings5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String pass = "";
        boolean passw = false;
        String search = "?";
        String result = url.substring(url.indexOf(search) + 1);
        String[] array = result.split("&");

        for (int i = 0; i < array.length; i++) {
            if (array[i].endsWith("=")) {
                array[i] = array[i] + "not found";
            }
            if (array[i].contains("pass") && !array[i].contains("not found")) {
                passw = true;
                pass = array[i];
            }

            System.out.println(array[i].replace("=", " : "));

        }
        if (passw == true) {
            System.out.println(pass.replace("pass=", "password : "));
        }
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String parameters = line.split("\\?")[1];

        for (String items : parameters.split("&")) {
            if (items.split("=").length == 2) {
                System.out.println(items.replaceAll("=", " : "));
            } else {
                System.out.println(items.replaceAll("=", " : ") + "not found");
            }
        }

        if (parameters.contains("pass")) {
            for (String items : parameters.split("&")) {
                String[] temp = items.split("=");
                if (temp[0].equals("pass")) {
                    System.out.println("password : " + temp[1]);
                }
            }
        }
    }
 */