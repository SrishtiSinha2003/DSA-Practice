public class countSetBits {
    public static void main(String[] args) {
        int n = 6;

        int count = 0;
        for(int i=0; i<32; i++) {
            if((n&1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.print(count);
    }
}
