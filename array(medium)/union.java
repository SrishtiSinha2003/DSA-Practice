import java.util.*;

public class union {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 2, 3, 3, 2};

        Set<Integer> set = new HashSet<>(); //doesn't maintain order

        // add elements of a
        for(int x : a){
            set.add(x);
        }

        // add elements of b
        for(int x : b){
            set.add(x);
        }

        System.out.println(set);
    }
}

/*Key points:

Data structure: HashSet

Removes duplicates automatically ✔

Does not maintain order ❌

Does not sort elements ❌

Output:

Only distinct elements, order can be random.

 */