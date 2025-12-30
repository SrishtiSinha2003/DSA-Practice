public class bullsAndCows {
    public static String getHint(String S, String G) {
        int n = S.length();
        int bulls = 0, cows = 0;

        int[] freqS = new int[10]; // frequency of unmatched digits in S digits 0-9
        int[] freqG = new int[10]; // frequency of unmatched digits in G 

        // Step 1: Find bulls & collect frequencies for non-bull positions
        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == G.charAt(i)) {
                bulls++;
            } else {
                freqS[S.charAt(i) - '0']++;
                freqG[G.charAt(i) - '0']++;
            }
        }

        // Step 2: Count cows from matching frequencies
        for (int d = 0; d < 10; d++) {
            cows += Math.min(freqS[d], freqG[d]);
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        String S = "1807";
        String G = "7810";
        System.out.println(getHint(S, G));
    }
}

