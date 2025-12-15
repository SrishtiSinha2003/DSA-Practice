import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


//Why Set?
//🌟 Because Set automatically:

//✔ removes duplicates
//✔ stores only unique values
//✔ TreeSet stores in sorted order

public class unionSorted {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new TreeSet<>();
        
        for(int i=0; i<a.length; i++) {
            set.add(a[i]);
        }
        for(int i=0; i<b.length; i++) {
            set.add(b[i]);
        }
        ArrayList<Integer> result = new ArrayList<>(set);
        return result;
    }
    public static void main(String args[]) {
        int[] a = {1,1,2,2,2,4};
        int[] b = {2,2,4,4};

        ArrayList<Integer> result = findUnion(a, b);
        for(int x:result) {
            System.out.println(x+ " ");
        }
    }
}
/*Key points:

Data structure: TreeSet

Removes duplicates automatically ✔

Maintains elements in sorted order ✔

Conversion to ArrayList preserves that sorted order

Output:

Distinct elements always sorted in ascending order */