package retailItem;

public class Main {
        public static void main(String[] args) {
            RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
            RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
            RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

            displayItemInfo(item1);
            displayItemInfo(item2);
            displayItemInfo(item3);
        }

        public static void displayItemInfo(RetailItem item) {
            System.out.println("Description: " + item.getDescription());
            System.out.println("Units on Hand: " + item.getUnitsOnHand());
            System.out.println("Price: $" + item.getPrice());
            System.out.println();
        }

}
