import java.util.*;

public class intersection {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};

        HashSet<Integer> setA = new HashSet<>();

        // add all elements of a
        for(int x : a){
            setA.add(x);
        }

        ArrayList<Integer> result = new ArrayList<>();

        // check for common elements
        for(int x : b){
            if(setA.contains(x)){
                result.add(x);
                setA.remove(x); // to avoid duplicates in result
            }
        }

        System.out.println(result);
    }
}


/*If you want same order as appearance:

Switch HashSet → LinkedHashSet 

We check if(setA.contains(x)):

For first x = 3 → setA contains 3 → true → add 3 to result

Then we do setA.remove(x) → remove 3 from setA → setA = {1,2}

Why remove from setA?

Next x = 2 → setA.contains(2) → true → add 2 → remove 2 from setA → setA = {1}

Next x = 2 again → setA.contains(2) → false (we removed it already) → not added again

✅ This ensures no duplicates in the result






*/