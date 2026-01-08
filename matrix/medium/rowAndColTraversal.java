public class rowAndColTraversal {
     // 1️⃣ Row-wise Traversal
    static void rowWise(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
    }

    // 2️⃣ Column-wise Traversal
    static void colWise(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        System.out.println();
    }

    // 3️⃣ Row-wise ZigZag Traversal
    static void rowZigZag(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // 4️⃣ Column-wise ZigZag Traversal
    static void colZigZag(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4, 5, 6},
            {7, 8, 9}
        };
         System.out.println("Row-wise Traversal:");
        rowWise(mat);

        System.out.println("\nColumn-wise Traversal:");
        colWise(mat);

        System.out.println("\nRow-wise ZigZag Traversal:");
        rowZigZag(mat);

        System.out.println("\nColumn-wise ZigZag Traversal:");
        colZigZag(mat);
    }
}
