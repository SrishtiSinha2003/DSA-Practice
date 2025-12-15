public class missingNumber {
    public static int num(int[] arr) {
        int xor = arr.length;
        for(int i=0; i<arr.length; i++) {
            xor = xor^i;
            xor = xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(num(arr));
    }
}
