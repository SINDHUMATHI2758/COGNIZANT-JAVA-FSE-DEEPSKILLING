public class Main {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("nature.jpg");
        Image img2 = new ProxyImage("sunset.png");

        System.out.println("First call to img1:");
        img1.display();

        System.out.println("\nSecond call to img1 (should be cached):");
        img1.display();

        System.out.println("\nFirst call to img2:");
        img2.display();
    }
}
