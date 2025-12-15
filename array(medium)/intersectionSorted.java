import java.util.*;

public class intersectionSorted {
    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 2, 3, 5};

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        while(i < a.length && j < b.length){
            if(a[i] == b[j]){

                // add only if first occurrence to avoid duplicates

                if(result.isEmpty() || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }

/*

Step 1: result.isEmpty()

Before adding the first element, result is empty.

So we always add the first matching element.

Step 2: result.get(result.size()-1) != a[i]

result.get(result.size()-1) → last element added to result.

a[i] → current element from array a (equal to b[j]).

If the last element is not equal to the current one, we add it.

✅ This prevents adding the same element multiple times if it occurs consecutively in sorted arrays.

Since arrays are sorted, duplicates are consecutive.

We only need to compare with the last added element.

Efficient: O(1) check instead of scanning whole result.
“Add a[i] to result only if result is empty or a[i] is not the same as the last added element.”

Ensures intersection has distinct elements

Works because arrays are sorted */



                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            } else{
                j++;
            }
        }

        System.out.println(result);
    }
}

/*How it works

Both arrays are sorted → use two pointers i and j.

Compare a[i] and b[j]:

If equal → add to result (skip duplicates)

If a[i] < b[j] → move i forward

If a[i] > b[j] → move j forward

Repeat until any array ends.

Time Complexity: O(n + m)
Space Complexity: O(1) extra (excluding result) */