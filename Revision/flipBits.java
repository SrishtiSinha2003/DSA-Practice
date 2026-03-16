public class flipBits {
    public static int flip(int start, int goal) {
        int count = 0;
        int xor = start ^ goal;
        while(xor != 0) {
            count += xor&1;
            xor >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        System.out.print(flip(start, goal));
    }
}
