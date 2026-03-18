import java.util.Arrays;
public class closingTriplets {
    public static void main(String[] args) {
        int[] a = {10,8,5,4,1};
        int[] b = {6,9,15};
        int[] c = {8,3,2,6};

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        int i=0, j=0, k=0;

        int ans = Integer.MAX_VALUE;

        while(i<a.length && j<b.length && k<c.length) {
            int minVal = Math.min(a[i] , Math.min(b[j], c[k]));
            int maxVal = Math.max(a[i], Math.max(b[j], c[k]));

            ans = Math.min(ans, maxVal-minVal);

            if(minVal == a[i]) i++;
            else if(minVal == b[j]) j++;
            else k++;
        }
        
        System.out.print(ans);
    }
}
