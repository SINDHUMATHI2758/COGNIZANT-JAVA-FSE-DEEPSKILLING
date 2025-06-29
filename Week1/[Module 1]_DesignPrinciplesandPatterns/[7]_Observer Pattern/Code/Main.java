public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobile1 = new MobileApp("PhoneApp");
        Observer web1 = new WebApp("Dashboard");

        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(web1);

        System.out.println("=== First Stock Update ===");
        stockMarket.setStockPrice("TCS", 3750.50);

        System.out.println("\n=== Second Stock Update ===");
        stockMarket.setStockPrice("INFY", 1420.30);

        System.out.println("\n=== Removing Mobile Observer ===");
        stockMarket.removeObserver(mobile1);

        System.out.println("\n=== Third Stock Update ===");
        stockMarket.setStockPrice("WIPRO", 615.00);
    }
}
