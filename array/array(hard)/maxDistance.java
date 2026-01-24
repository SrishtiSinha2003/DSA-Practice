public class maxDistance {
    public static int distance(int[] seats) {
        int zero = 0;
        int maxDist = 0;
        boolean seen = false;

        for(int i=0; i<seats.length; i++) {
            if(seats[i] == 0) {
                zero++;
            } else {
                if (!seen) {
                    maxDist = Math.max(maxDist, zero);
                } else {
                    maxDist = Math.max(maxDist, (zero+1)/2);
                }
                zero = 0;
                seen = true;
            }
        }
        maxDist = Math.max(maxDist, zero);
        return maxDist;
    }
    public static void main(String[] args) {
        int[] seats = {1,0,0,0};
        System.out.println(distance(seats));
    }
}
