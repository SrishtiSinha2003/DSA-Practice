public class kokoEatingBananas {
    public static int koko(int[] arr, int k) {
        int l = 1;
        int h = 0;

       // Find the max pile to set upper bound of binary search
       for(int bananas:arr) {
        h = Math.max(bananas, h);
       }
       
       // binary search
       while (l < h) { 
        int mid = l + (h - l) / 2; 
        int hours = 0;

        // Calculate hours needed for this speed 
        for (int bananas : arr) { 
            hours += (bananas + mid - 1) / mid; // ceil(bananas / mid) 
            } 
            if (hours <= k) { h = mid; // try smaller speed 
            } else { l = mid + 1; // need more speed 
            }
       }
       return l;
    }
    public static void main(String[] args) {
        int[] arr = {5, 10, 3};
        int k = 4;
        System.out.println(koko(arr, k));
    }
}
