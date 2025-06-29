public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer.Builder("Intel i5", "8GB", "512GB SSD", "Intel UHD", "Windows 10").build();
        Computer c2 = new Computer.Builder("Ryzen 7", "16GB", "1TB SSD", "NVIDIA RTX 4060", "Windows 11").build();

        System.out.println("Computer 1:\n" + c1 + "\n");
        System.out.println("Computer 2:\n" + c2);
    }
}
