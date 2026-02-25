import java.util.ArrayList;
public class findMissingAndRepeating {
    public static ArrayList<Integer> find (int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] count = new int[arr.length+1];
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        for(int i=0; i<=arr.length; i++) {
            if(count[i] == 2) {
                repeating = i;
            }
            if(count[i] == 0) {
                missing = i;
            }
        }
        result.add(missing);
        result.add(repeating);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2};
        System.out.println(find(arr));
    }
}
