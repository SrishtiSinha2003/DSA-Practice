import java.util.Arrays;
public class countElementsLessThanK {
    public static int countLessEqual(int[] arr, int x) {
        // code here
        int count = 0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        System.out.println(countLessEqual(arr, x));
    }
}
