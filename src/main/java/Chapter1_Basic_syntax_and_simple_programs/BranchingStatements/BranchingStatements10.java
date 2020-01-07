
public class BranchingStatements10 {
    public static void main(String[] args) {
 /*       int i = 0;
        while(i < 10) {
            System.out.print(i);
            if (i == 5) {
                break;
            }
            i++;
        }
  output 012345 */

 /*       int j = 0;
        while(j < 10) {
            j++;
            if (j == 5) {
                continue;
            }
            System.out.print(j);

    }
}
output 1234678910
  */
   /*     for (int k = 0; k < 10; k++) {
            if (k > 5) {
                continue;
            }
            System.out.print(k);
        }
    }
}
//output 012345 */
     /*   for (int i = 0; i < 5; i++) {
            for (char letter = 'a'; letter <= 'f'; letter++) {
                if (letter < 'f') {
                    continue;
                }
                System.out.println(letter);
            }
        }*/
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            for (int j = 0; j < 5; j++) {
                System.out.println(j);
                break;
            }
        }
    }}