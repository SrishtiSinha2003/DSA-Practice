public class penaltyOfShop {
    public static int bestClosingTime(String customers) {
        int penalty = 0;

        // Initial penalty: shop closed all day → all 'Y' cause penalty
        for (char c : customers.toCharArray()) {
            if (c == 'Y') penalty++;
        }

        int minPenalty = penalty;
        int bestHour = 0;

        // Try closing at hour j from 1 to n
        for (int j = 1; j <= customers.length(); j++) {
            char prev = customers.charAt(j - 1);

            if (prev == 'Y') {
                penalty--; // now open, so no penalty
            } else {
                penalty++; // open but no customer
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = j;
            }
        }

        return bestHour;
    }
    public static void main(String[] args) {
        String customers = "YYNY";
        System.out.println(bestClosingTime(customers));
    }
}


