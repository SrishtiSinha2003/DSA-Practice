public class bestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int res = 0;
        for(int price : prices) {
            if(price < min) {
                min = price;
            } else {
                res = Math.max(price-min, res);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }
}
