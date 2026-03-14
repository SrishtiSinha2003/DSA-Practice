public class goodDigitString {
    static final long MOD = 1000000007;
    public static int countGood(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long evenPow = power(5, even);
        long oddPow = power(4, odd);

        return(int) ((evenPow * oddPow) % MOD);
    }
    public static long power(long base, long exp) {
        long result = 1;
        base = base % MOD;
 
        while(exp > 0) {
            if(exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) %  MOD;
            exp /= 2;
        }
        return result;
    }
    public static void main(String[] args) {
        long n = 4;
        System.out.println(countGood(n));
    }
}
