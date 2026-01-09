class sumOfRowAndCol {
    
    // Function to compute row and column sums
    static int[] sumRowsAndCols(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m + n];

        // Compute row sums
        for(int i = 0; i < m; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += mat[i][j];
            }
            result[i] = sum;
        }

        // Compute column sums
        for(int j = 0; j < n; j++) {
            int sum = 0;
            for(int i = 0; i < m; i++) {
                sum += mat[i][j];
            }
            result[m + j] = sum;
        }

        return result;
    }

    // Function to print the result array
    static void printArray(int[] arr, int m, int n) {
        for(int i = 0; i < m; i++) {
            System.out.println("Sum of row " + i + " = " + arr[i]);
        }
        System.out.println();
        for(int j = 0; j < n; j++) {
            System.out.println("Sum of column " + j + " = " + arr[m + j]);
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int[] result = sumRowsAndCols(mat);
        printArray(result, 4, 4);
    }
}