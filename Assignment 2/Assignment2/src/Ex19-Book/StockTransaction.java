public class StockTransaction {
    public static void main(String[] args) {
        int sharesBought = 1000;
        double purchasePricePerShare = 32.87;
        double commissionRate = 0.02;
        
        int sharesSold = 1000;
        double salePricePerShare = 33.92;

        double purchaseAmount = sharesBought * purchasePricePerShare;
        double purchaseCommission = purchaseAmount * commissionRate;

        double saleAmount = sharesSold * salePricePerShare;
        double saleCommission = saleAmount * commissionRate;

        double profit = (saleAmount - saleCommission) - (purchaseAmount + purchaseCommission);

        System.out.printf("Amount paid for the stock: $%.2f%n", purchaseAmount);
        System.out.printf("Commission paid on the purchase: $%.2f%n", purchaseCommission);
        System.out.printf("Amount the stock sold for: $%.2f%n", saleAmount);
        System.out.printf("Commission paid on the sale: $%.2f%n", saleCommission);
        System.out.printf("Profit after commissions: $%.2f%n", profit);
    }
}