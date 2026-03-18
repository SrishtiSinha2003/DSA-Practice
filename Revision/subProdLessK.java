public class subProdLessK {
    public static int prod(int[] arr, int k) {
        if(k<=1) return 0;

        int left = 0;
        int product = 1;
        int count = 0;

        for(int right = 0; right<arr.length; right++) {
            product *= arr[right];

            while(product >= k) {
                product /= arr[left];
                left++;
            }
            count += right-left+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,5,2,6};
        int k = 100;
        System.out.print(prod(arr, k));
    }
}
