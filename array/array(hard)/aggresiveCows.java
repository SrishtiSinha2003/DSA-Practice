import java.util.Arrays;
public class aggresiveCows {
    public static boolean check(int[] stalls, int k, int dist) {
        int cnt = 1;
        int prev = stalls[0];

        for(int i=1; i<stalls.length; i++) {
            if(stalls[i] - prev >= dist) {
                cnt++;
                prev = stalls[i];
            }
        }
        return ( cnt >= k);
    }
    public static int cows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int res = 0; // to keep best possible result

        int l = 1;
        int h = stalls[stalls.length - 1] - stalls[0];

        while(l <= h) {
            int mid = l + (h - l)/2;
            if(check(stalls, k, mid)) {
                res = mid;
                l = mid + 1;
            }
            else {
                h = mid -1;
            }
        }
        return res;
    }
    public static void main (String[] arrgs) {
        int[] stalls = {1,2,4,8,9};
        int k = 3;
        System.out.println(cows(stalls, k));
    }
}
