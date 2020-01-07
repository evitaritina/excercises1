import java.util.Arrays;
import java.util.Scanner;

/**
 * Iterating over arrays → Individual taxes
 * In some country, there are N companies, and the law of that country say that the taxes of each company are individual and appointed by a president.
 * President wants to know which company pays the most taxes. But sadly, none of the president's proxies know math very well,
 * so this work is transferred to you. Can you solve this problem?
 *
 * The first line of the input contains N - the number of companies in this country.
 * The second line contains yearly incomes of each company. All numbers are non-negative integers.
 * The third line contains individual taxes for each company in percents of the company's income. All numbers are integers from 0 to 100 inclusive.
 *
 * You should output № of the company that pays the most taxes. Keep in mind that the enumeration of the companies starts from number 1.
 * If there are several companies with the same payments sizes, output the number of the company with the lowest number.
 */
public class IteratingOverArrays5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfCompanies = scanner.nextInt();
        int[] yearlyIncomesOfEachCompany = new int[numberOfCompanies];
        int[] individualTaxesForEachCompanyInPercents = new  int[numberOfCompanies];
        double sum = 0.0;
        double res = 0.0;
        int counter = 0;
        int counter1 = 0;
        for(int i = 0; i<numberOfCompanies; i++){
            yearlyIncomesOfEachCompany[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(yearlyIncomesOfEachCompany));
        for(int j = 0; j<numberOfCompanies; j++){
            individualTaxesForEachCompanyInPercents[j] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(individualTaxesForEachCompanyInPercents));
for(int z = 0; z<numberOfCompanies; z++){
    System.out.println(z+ " " +yearlyIncomesOfEachCompany[z]+ " " +individualTaxesForEachCompanyInPercents[z]);
//    sum = 100 / yearlyIncomesOfEachCompany[z] * individualTaxesForEachCompanyInPercents[z];
    sum = yearlyIncomesOfEachCompany[z] * individualTaxesForEachCompanyInPercents[z];
    System.out.println("index "+z+ " sum " +sum + " " +yearlyIncomesOfEachCompany[z]+ " " +individualTaxesForEachCompanyInPercents[z]);
    counter++;
    if(res<sum){
        res = sum;
        counter1 = counter;
    }

//    System.out.println(" answer " +counter);
    System.out.println(res);

}
        System.out.println(" answer " +counter1);

    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float[] arrayIncome = new float[n];
        float[] arrayPercent = new float[n];
        float[] arrayTaxes = new float[n];

        float x = 0;
        int y = 1;

        for(int i = 0; i < arrayIncome.length; i++) {
            arrayIncome[i] = scanner.nextFloat();
        }

        for(int j = 0; j < arrayPercent.length; j++) {
            arrayPercent[j] = scanner.nextFloat();
            arrayTaxes[j] = arrayIncome[j] * arrayPercent[j] / 100;

            if (arrayTaxes[j] > x) {
                x = arrayTaxes[j];
                y = j + 1;
            }

        }

        System.out.println(y);
    }
 */