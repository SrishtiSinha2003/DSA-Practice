public class kthElementOfTwoArray {
    public static int kthElement(int[] a, int[] b, int k) {
        int i=0, j=0;
        int count = 0;
        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]){
                count++;
                if (count == k) return a[i];
                i++;
            } else {
                count++;
                if(count == k) return b[j];
                j++;
            }
        }
        while(i < a.length) {
            count++;
            if (count == k) return a[i];
            i++;
        }
        while(j< b.length) {
            count++;
            if (count == k) return b[j];
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 6, 7, 9};
        int[] b = {1, 4, 8, 10};
        int k = 5;
        System.out.println(kthElement(a, b, k));
    }
}
