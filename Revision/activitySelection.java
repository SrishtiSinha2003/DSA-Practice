public class activitySelection {
    public static int maxActivities(int[] start, int[] end) {
        int count = 1;
        int lastEnd = end[0];
        for(int i=1; i<start.length; i++) {
            if(start[i] >= lastEnd) {
                count++;
                lastEnd = end[i];
            }
        }
        return count;
    }
     public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};
        System.out.println(maxActivities(start, end));
    }
}
