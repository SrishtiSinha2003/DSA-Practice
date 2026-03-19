import java.util.*;
public class rankingBooks {
    public static int getRank(List<Integer> list, int pages) {
        int low = 0, high = list.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (list.get(mid) == pages) {
                return mid + 1;
            } 
            else if (list.get(mid) < pages) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return low + 1;
    }
    public static void main(String[] args) {
        int[] pages = {100, 100, 50, 40, 40, 20, 10};
        int[] pagesAtEnd = {5, 25, 50, 120};

        // remove duplicates
        List<Integer> list = new ArrayList<>();
        list.add(pages[0]);

        for (int i = 1; i < pages.length; i++) {
            if (pages[i] != pages[i - 1]) {
                list.add(pages[i]);
            }
        }

        // process each day
        for (int p : pagesAtEnd) {
            int rank = getRank(list, p);
            System.out.print(rank + " ");
        }
    }
}