import java.util.Scanner;
public class perfectNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int maxN = 100000;
        boolean dp[] = new boolean[maxN+1];

        for(int i=1; i<=maxN; i++) {
            for(int j=1; j*j<=i; j++) {
                if(!dp[i-j*j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        while(t-->0) {
            int n = sc.nextInt();
            if(dp[n]) System.out.println("win");
            else System.out.println("loose");
        }
        sc.close();
    }
}
