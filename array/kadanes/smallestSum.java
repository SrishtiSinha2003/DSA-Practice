public class smallestSum {
    public static int sum(int[] arr) {
        int minSoFar = arr[0];
        int curSoFar = arr[0];

        for(int i=0; i<arr.length; i++) {
            curSoFar = Math.min(curSoFar + arr[i], arr[i]);
            minSoFar = Math.min(curSoFar, minSoFar);
        }
        return minSoFar;
    }
    public static void main(String args[]) {
        int[] arr =  {3, -4, 2, -3, -1, 7, -5};
        System.out.println(sum(arr));
    }
}
