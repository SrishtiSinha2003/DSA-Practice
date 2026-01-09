public class matrixDiagonalSum {
    public static int sum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // primary diagonal
        for(int i=0; i<n; i++) {
            sum += mat[i][i];

        // secondary diagonal
        sum += mat[i][n-1-i];

        // If both diagonals overlap, subtract once
            if (i == n - 1 - i) {
                sum -= mat[i][i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(sum(mat));
    }
}
