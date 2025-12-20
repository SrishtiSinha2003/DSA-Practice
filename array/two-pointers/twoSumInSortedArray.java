import java.util.ArrayList;
public class twoSumInSortedArray {
    static ArrayList<Integer> sum(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                ans.add(left+1);
                ans.add(right+1);
                return ans;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        ans.add(-1);
        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(sum(arr, target));
    }
}
