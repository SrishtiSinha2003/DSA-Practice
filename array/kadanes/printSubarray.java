public class printSubarray {
    public static int sum(int[] arr) {
        int maxSoFar = arr[0];
        int curSoFar = arr[0];

        int start = 0;
        int end = 0;
        int s = 0;

        for(int i=1; i<arr.length; i++) {

            if (arr[i] > curSoFar + arr[i]) {
                curSoFar = arr[i];
                s = i;   // new subarray starts here
            } else {
                curSoFar = curSoFar + arr[i];
            }

            if (curSoFar > maxSoFar) {
                maxSoFar = curSoFar;
                start = s;  // update start of best
                end = i;    // update end of best
            }
        }

        System.out.print("Max Sum Subarray: ");
        for(int i=start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return maxSoFar;
    }

    public static void main(String args[]) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println("Max Sum = " + sum(arr));
    }
}


