import java.util.*;

public class distinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N + 1]; // 1-based indexing
            for(int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
            }

            int[] dp = new int[N + 2];
            HashSet<Integer> set = new HashSet<>();

            // Build dp from right
            for(int i = N; i >= 1; i--) {
                set.add(A[i]);
                dp[i] = set.size();
            }

            // Answer queries
            for(int i = 0; i < M; i++) {
                int l = sc.nextInt();
                System.out.print(dp[l] + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
