import java.util.*;

public class boolShelf {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] books = new int[n];
        int[] shelves = new int[n];
        
        for (int i = 0; i < n; i++) books[i] = sc.nextInt();
        for (int i = 0; i < n; i++) shelves[i] = sc.nextInt();

        boolean[] used = new boolean[n];
        int unplaced = 0;

        for (int i = 0; i < n; i++) {
            boolean placed = false;
            for (int j = 0; j < n; j++) {
                if (!used[j] && shelves[j] >= books[i]) {
                    used[j] = true;
                    placed = true;
                    break;
                }
            }
            if (!placed) unplaced++;
        }

        System.out.println(unplaced);
        sc.close();
    }
}