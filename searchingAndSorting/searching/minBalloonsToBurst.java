import java.util.Arrays;

public class minBalloonsToBurst {
    public static int min(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[1],b[1]));
        int ans = 0;
        int arrow = 0;
        for(int i=0; i<points.length; i++) {
            if(points[i][0] > arrow) {
                ans++;
                arrow = points[i][1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] points = {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(min(points));
    }
}
