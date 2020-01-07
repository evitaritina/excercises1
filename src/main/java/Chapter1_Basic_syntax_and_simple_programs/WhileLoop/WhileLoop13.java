import java.util.Scanner;

/**
 * The while and do-while loops → Profit
 * Typical task for a job interview.
 * Ann put MM money in the bank. The bank increases Ann's deposit by PP percent every year.
 * Ann wants to know how many years should pass until her deposit in the bank reaches KK money.
 * Can you help her to answer this question?
 *
 * Input contains three integers - M, P, K. It is guaranteed that all numbers are positive and MK≥M.
 * Output the answer to Ann's question.
 */
public class WhileLoop13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        int year = 0;
        double perYear = 0.0;
        double m1 = Double.valueOf(m);
        double p1 = Double.valueOf(p);

        do {
            perYear =  m1*p1/100;
            year++;
            m1 += perYear;
        }  while(m1 < Double.valueOf(k));
        if(m==k){
            year = 0;
        }

        System.out.println(year);
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double current = scanner.nextInt();
        int length = 0;
        double percent = scanner.nextInt();
        int goal = scanner.nextInt();

        while (current < goal) {
            current *= (1 + percent / 100);
            length++;
        }

        System.out.print(length);
    }
 */