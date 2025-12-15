public class Countfreq {
    public static int feq(int [] arr, int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
           // count = arr[i]; // gives last array element i.e 4
            if(arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {3,5,3,1,3,2,3,2,6,3,7,4};
        System.out.println(feq(arr, 3));
    }
}
