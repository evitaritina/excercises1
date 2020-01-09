package Chapter1_Basic_syntax_and_simple_programs.MultiDimensionalArray;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * Multi-dimensional array → Sum of neighbours
 * Write a program, which inputs the rectangular matrix from a sequence of lines,
 * ending with a line, containing the only word "end" (without the quotation marks).
 *
 * The program should output the matrix of the same size,
 * where each element in the position (i, j) is equal to the sum of the elements from the first matrix on the positions
 * (i-1, j)(i+1, j)(i, j-1), (i, j+1).
 * Boundary elements have neighbours on the opposite side of the matrix.
 * In the case of one row or column, the element itself may be its neighbour.
 *
 * Sample Input 1:
 * 9 5 3
 * 0 7 -1
 * -5 2 9
 * end
 * Sample Output 1:
 * 3 21 22
 * 10 6 19
 * 20 16 -1
 * Sample Input 2:
 * 1
 * end
 * Sample Output 2:
 * 4
 */
public class MultiDimensionalArray10 {
    static void rewriteArray(int array[][]){

    }
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> matrix = reader.lines()
                .takeWhile(line -> !"end".equals(line))
                .map(line -> Arrays.stream(line.split(" "))
                        .map(Integer::valueOf)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        int height = matrix.size();
        int width = matrix.get(0).size();

        for (int i = 0; i < height; i++) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 0; j < width; j++) {
                int value = matrix.get((height + i - 1) % height).get(j)
                        + matrix.get((height + i + 1) % height).get(j)
                        + matrix.get(i).get((width + j - 1) % width)
                        + matrix.get(i).get((width + j + 1) % width);
                joiner.add(String.valueOf(value));
            }
            System.out.println(joiner.toString());
        }
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String temp = "";
        String finalString = "";
        int dim = -1;

        while (!"end".equals(temp)) {
            finalString = finalString + temp + " ";
            temp = scanner.nextLine();
            dim++;
        }

        scanner.close();
        scanner = new Scanner(finalString);
        int count = 0;

        while (scanner.hasNextInt()) {
            scanner.nextInt();
            count++;
        }

        scanner.close();
        int column = count / dim;
        int[][] inArray = new int[dim][column];
        scanner = new Scanner(finalString);

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < column; j++) {
                inArray[i][j] = scanner.nextInt();
            }
        }

        int[][] outArray = new int[dim][column];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < column; j++) {
                int left = j - 1;
                int top = i - 1;
                int right = j + 1;
                int bot = i + 1;
                if (i == 0) {
                    top = dim - 1;
                }
                if (i == dim - 1) {
                    bot = 0;
                }
                if (j == 0) {
                    left = column - 1;
                }
                if (j == column - 1) {
                    right = 0;
                }
                outArray[i][j] =
                        inArray[i][left] + inArray[i][right] + inArray[top][j] + inArray[bot][j];
            }
        }
        scanner.close();

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(outArray[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 */