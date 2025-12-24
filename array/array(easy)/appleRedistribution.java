import java.util.Arrays;

public class appleRedistribution {
    public static int minimumBoxes(int[] apples, int[] capacity) {
        int sum = 0;
        for(int i=0; i<apples.length; i++) {
            sum += apples[i];
        }
        Arrays.sort(apples);
        int boxes = 0;
        for(int i=capacity.length-1; i>=0; i--) {
            sum -= capacity[i];
            boxes++;
            if(sum <=0 ) {
                break;
            }
        }
        return boxes;
    }
    public static void main(String[] args) {
        int[] apples = {1,2,3};
        int[] capacity = {4,3,1,5,2};
        System.out.println(minimumBoxes(apples, capacity));
    }
}
