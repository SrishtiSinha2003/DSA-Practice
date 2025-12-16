import java.util.*;

public class linkedHashset {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 2, 1};
        int b[] = {3, 2, 2, 3, 3, 2};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // add from b first
        for(int x : b){
            set.add(x);
        }

        // then add from a
        for(int x : a){
            set.add(x);
        }

        // convert to arraylist or print directly
        System.out.println(set);
    }
}
/*
Idea

Use a LinkedHashSet ⬅ preserves insertion order

Add b first

Then add a

Print the set
 */
