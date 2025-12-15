public class singleNumberIII {
    public static int[] num(int[] arr) {
        int xor = 0;

        for(int i=0; i<arr.length;i++) {
            xor ^= arr[i];
        }
        int diffBit = xor & (-xor);
        int num1 = 0, num2 = 0;

        for(int i=0; i<arr.length; i++) {
            if((arr[i] & diffBit) == 0) {
                num1 ^= arr[i];
            } else {
                num2 ^= arr[i];
            }
        }
        return new int[]{num1, num2};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,5};
        int[] result = num(arr);
        System.out.println(result[0]+ " "+ result[1]);
    }
}
