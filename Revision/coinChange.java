public class coinChange {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        if((x+y) % 3 == 0 && Math.max(x,y) <= 2 * Math.min(x,y)) {
            /*One pile cannot be more than double the other
            Because in one move the maximum removed from one pile is 2. */
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
