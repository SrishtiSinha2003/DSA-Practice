import java.util.Arrays;
public class permutationPairSum {
    public static boolean pair(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0; i<a.length; i++){
            if(a[i] + b[a.length-i-1] < k) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {2, 1, 3};
        int b[] = {7, 8, 9};
        int k = 10;
        System.out.print(pair(a, b, k));
    }
}