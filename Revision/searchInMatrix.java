public class searchInMatrix {
    public static boolean search(int[][] mat, int target) {
        int m = mat.length;
        int n = mat[0].length;
        int left = 0;
        int right = m*n-1;

        while(left <= right) {
            int mid = left + (right - left);
            int mid_val = mat[mid/n][mid % n];

            if(mid_val == target) {
                return true;
            } else if(mid_val < target) {
                left = mid+1;
            } else 
                right = mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 3;
        System.out.print(search(mat, target));
    }
}
