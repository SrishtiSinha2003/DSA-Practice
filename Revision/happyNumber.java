public class happyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = square(slow);
            fast = square(square(fast));
        } while(slow != fast);
        return slow == 1;
    }
    public static int square(int n) {
        int ans = 0;
        while(n>0) {
            int remainder = n % 10;
            ans += remainder * remainder;
            n /= 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 19;
        /*Explanation:
        1^2 + 9^2 = 82
        8^2 + 2^2 = 68
        6^2 + 8^2 = 100
        1^2 + 0^2 + 0^2 = 1  -->   true  */
        int m = 2;
        System.out.println(isHappy(n));
        System.out.println(isHappy(m));
    }
}
