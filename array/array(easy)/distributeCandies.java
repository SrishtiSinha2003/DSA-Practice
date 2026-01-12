import java.util.HashSet;
import java.util.Set;

public class distributeCandies {
    public static int candy(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int i : candyType) {
            set.add(i);
        }
        int n = candyType.length / 2;
        if(set.size() >= n) {
            return n;
        } else {
            return set.size();
        }
    }
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        System.out.println(candy(candyType));
    }
}
