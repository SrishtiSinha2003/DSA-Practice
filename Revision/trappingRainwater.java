public class trappingRainwater {
    public static int maxWater(int[] heights) {
        if(heights == null || heights.length == 0) {
            return 0;
        }
        int left = 0;
        int right = heights.length-1;
        int rightMax = 0;
        int leftMax = 0;
        int total = 0;
        while(left < right) {
            if(heights[left] < heights[right]) {
                if(heights[left] >= leftMax) {
                    leftMax = heights[left];
                } else {
                    total += leftMax - heights[left];
                } left++;
            } else {
                if(heights[right] >= rightMax) {
                    rightMax = heights[right];
                } else {
                    total += rightMax - heights[right];
                } right--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] heights = {4,2,0,6,3,2,5};
        System.out.print(maxWater(heights));
    }
}
