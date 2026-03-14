public class pow {
    public static double powCal(double x, int n) {
        long N = n;
        if(N < 0) {
            x = 1/n;
            N = -n;
        }
        return calPow(x, N);
    }
    private static double calPow(double x, long n) {
        if(n == 0) {
            return 1.0;
        }
        double half = calPow(x, n/2);
        if(n % 2 == 0) {
            return half*half;
        } else {
            return half*half*x;
        }
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.print(powCal(x, n));
    }
}
