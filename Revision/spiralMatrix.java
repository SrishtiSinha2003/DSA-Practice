import java.util.*;

public class spiralMatrix {
    public static List<Integer> spiral(int[][] mat) {
        List<Integer> result = new ArrayList<>();
        if(mat == null || mat.length == 0) return result;

        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1; 

        while (top <= bottom && left <= right) {

            // left → right
            for (int i = left; i <= right; i++) {
                result.add(mat[top][i]);
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                result.add(mat[i][right]);
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(mat[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(mat[i][left]);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        List<Integer> res = spiral(mat); // ✅ store result

        // 🖨️ PRINT SPIRAL
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}