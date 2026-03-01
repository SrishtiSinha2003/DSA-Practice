import java.util.HashSet;
public class pairSum {
    public static boolean find(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
        int complement = target - arr[i];
        if(set.contains(complement)) {
            return true;
        }
        set.add(arr[i]);
    }
    return false;
}
    public static void main(String[] args) {
        int[] arr = {11, 15, 6, 8, 9, 10};
        int target = 16;
        if(find(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
