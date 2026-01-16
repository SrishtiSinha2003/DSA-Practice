public class policesAndThieves {
    public static int maxThief(int[] arr, int k) {
        int n = arr.length;
        int i=0, j=0;
        int count = 0;

        while(i<n && j<n) {
            while(i<n && arr[i] != 'P') i++;
            while(j<n && arr[j] != 'T') j++;

            if(i<n && j<n) {
                if(Math.abs(i-j) <= k) {
                    count++;
                    i++;
                    j++;
                } else if(i<j) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;
        System.out.println(maxThief(arr, k));
    }
}
