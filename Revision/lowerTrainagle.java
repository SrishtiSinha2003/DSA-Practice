import java.util.*;
public class lowerTrainagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // size of matrix
        int[][] matrix = new int[n][n];
        // input matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // convert to lower triangular
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j > i) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
