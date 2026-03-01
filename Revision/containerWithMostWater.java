public class containerWithMostWater {
    public static int water(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;
        while(left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int currArea = width*height;
            maxArea = Math.max(maxArea, currArea);
            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,4,2};
        System.out.print(water(arr));
    }
}
