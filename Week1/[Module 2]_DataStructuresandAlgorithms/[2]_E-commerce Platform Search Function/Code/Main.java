import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Product[] products = {
                new Product(101, "Apple", "Fruits", 10, 150.0),
                new Product(102, "Banana", "Fruits", 20, 50.0),
                new Product(103, "Carrot", "Vegetables", 30, 80.0),
                new Product(104, "Dates", "Dry Fruits", 15, 200.0),
                new Product(105, "Eggplant", "Vegetables", 25, 60.0)
        };
        System.out.print("Enter Product Name to Search: ");
        String name=SC.nextLine();
        System.out.print("Press '1' for Linear Search or Press '2' for Binary Search ");
        byte choice = SC.nextByte();
        switch(choice){
            case 1:
                LinearSearch linear = LinearSearch.getInstance();
                linear.linearSearch(products,name);
                break;
            case 2:
                BinarySearch binary = BinarySearch.getInstance();
                binary.binarySearch(products,name);
                break;
            default:
                System.out.println("Enter valid Choice");
                break;
        }

    }
}