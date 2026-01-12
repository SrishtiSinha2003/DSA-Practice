import java.util.Arrays;

public class boatToSavePeople {
    public static int boat(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int i=0, j=people.length-1;
        while(i<=j) {
            if(people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            boat++;
        }
        return boat;
    }
    public static void main(String[] args) {
        int[]  people = {1,2};
        int limit = 3;
        System.out.println(boat(people, limit));
    }
}
