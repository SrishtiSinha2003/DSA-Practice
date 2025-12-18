public class corporateFlightBooking {
    public static int[] bookings(int[][] bookings, int n) {
        int diff[] = new int[n+1];
        for(int[] booking : bookings) {
            int first = booking[0] - 1;
            int last = booking[1];
            int seats = booking[2];
            diff[first] += seats;
            if(last + 1 < n) {
                diff[last + 1] =- seats;
            }
        }
        int[] ans = new int[n];
        ans[0] = diff[0];

        for(int i=1; i<n; i++) {
            ans[i] = ans[i-1] + diff[i];
        }
        return ans  ;
    }
    public static void main(String[] args) {
        int [][] bookings =  {{1,2,10}, {2,3,20},{2,5,25}};
        int n = 5;
        int[] result = bookings(bookings, n);
        for(int seats : result) {
            System.out.print(seats + " ");
        }
    }
}
