public class secondSmallest {
    public static int secSmall(int[] arr) {
        int small = Integer.MAX_VALUE;
        int ssmall = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < small) {
                ssmall = small;
                small = arr[i];
            }
            else if(arr[i] > small && arr[i] < ssmall) {
            ssmall = arr[i];
        }
    }
        return ssmall;
    }
    public static void main(String args[]) {
        int[] arr = {3,1,2,4,2,1,3};
        System.out.println(secSmall(arr));
    }
}
