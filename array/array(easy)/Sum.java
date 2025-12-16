public class Sum {
    public static int sumarray(int [] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,1,4,3};
        System.out.println(sumarray(arr));
    }
}
