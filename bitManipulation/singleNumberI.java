public class singleNumberI {
    public static int XOR(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++) {
            result = result^arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(XOR(arr));
    }
}
