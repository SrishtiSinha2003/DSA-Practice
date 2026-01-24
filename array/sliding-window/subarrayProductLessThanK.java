public class subarrayProductLessThanK {
    public static int countArr(int[] arr, int k) {
       int count = 0;
       int prod = 1;
       int i = 0;
       for(int j=0; j<arr.length; j++) {
            prod *= arr[j];

            while(prod >= k) {
                prod /= arr[i];
                i++;
            }
            count += (j-i+1);
       }
       return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,5, 2,6};
        int k = 100;
        System.out.println(countArr(arr, k));
    }
}
