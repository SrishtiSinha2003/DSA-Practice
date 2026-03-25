public class sumOfSubRanges{
    public static long sum(int[] arr){
        long res = 0;
        for(int i=0; i<arr.length; i++) {
            int max = arr[i];
            int min = arr[i];
            for(int j=i; j<arr.length; j++){
                max = Math.max(max, arr[i]);
                min = Math.min(min, arr[i]);
                res += max-min;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.print(sum(arr));
    }
}