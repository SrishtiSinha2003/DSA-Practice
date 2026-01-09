import java.util.Arrays;

public class diagoanlTraverse {
    public static int[] traverse(int[][] matrix) {
        if (matrix == null || matrix.length == 0) 
            return new int[0];

        int m = matrix.length, n = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];

            if ((row + col) % 2 == 0) {
                if (col == n - 1) 
                    row++;
                else if (row == 0) 
                    col++;
                else { 
                    row--; 
                    col++; 
                }
            } else {
                if (row == m - 1) 
                    col++;
                else if (col == 0) 
                    row++;
                else { 
                    row++; 
                    col--; 
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[] list = traverse(matrix);
        System.out.print(Arrays.toString(list));
    }
}
