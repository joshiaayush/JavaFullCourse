package practice.codechef;
import java.util.*;
public class Problem11 {




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt(); // number of test cases

            for (int i = 0; i < t; i++) {
                int n = sc.nextInt(); // length of row and column of matrix
                generateMatrix(n);
            }
        }

        public static void generateMatrix(int n) {
            // check if it's possible to generate a matrix of size N×N with distinct rows and columns
            if (n == 2 || n == 3) {
                System.out.println("-1");
                return;
            }

            // create an empty matrix of size N×N
            int[][] matrix = new int[n][n];

            // fill the first row and first column with alternating 1's and 0's
            for (int i = 0; i < n; i++) {
                matrix[0][i] = i % 2;
                matrix[i][0] = i % 2;
            }

            // fill the rest of the matrix using the Gray code
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = matrix[i-1][j-1] ^ matrix[i-1][j];
                }
            }

            // check if all rows and columns are distinct
            for (int i = 0; i < n; i++) {
                int[] row = matrix[i];
                int[] col = new int[n];
                for (int j = 0; j < n; j++) {
                    col[j] = matrix[j][i];
                }
                if (!isValid(row) || !isValid(col)) {
                    System.out.println("-1");
                    return;
                }
            }

            // print the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
        }

        public static boolean isValid(int[] arr) {
            // check if all elements in the array are distinct
            Set<Integer> set = new HashSet<>();
            for (int i : arr) {
                if (set.contains(i)) {
                    return false;
                }
                set.add(i);
            }
            return true;
        }
    }


