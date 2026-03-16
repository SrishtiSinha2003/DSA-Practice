import java.util.*;

public class sumOfTwo {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0};

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if(sum % 2 != 0) {
            System.out.println("No");
            return;
        }

        int target = sum / 2;

        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if(set.contains(needed)) {
                found = true;
                break;
            }

            set.add(arr[i]);
        }

        if(found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}