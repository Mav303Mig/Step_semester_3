import java.util.Scanner;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int days = scanner.nextInt();
        int[] prices = new int[days];
        
        System.out.println("Enter stock prices:");
        for (int i = 0; i < days; i++) {
            prices[i] = scanner.nextInt();
        }
        
        System.out.println("Max Profit: " + maxProfit(prices));
        scanner.close();
    }
}