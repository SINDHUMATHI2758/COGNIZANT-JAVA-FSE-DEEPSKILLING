public class WebApp implements Observer {
    private String appName;

    public WebApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println("[" + appName + "] Web Notification: " + stockName + " is now ₹" + stockPrice);
    }
}
