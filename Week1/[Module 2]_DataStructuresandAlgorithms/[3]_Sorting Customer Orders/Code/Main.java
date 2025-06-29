import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        Order[] originalOrders = {
                new Order(105, "Alice", 1500.0),
                new Order(101, "Bob", 1200.0),
                new Order(104, "Charlie", 2500.0),
                new Order(103, "Diana", 900.0),
                new Order(102, "Eve", 1800.0)
        };
        Order[] orders = originalOrders.clone();

        System.out.println("Original Orders:");
        for (Order o : orders) o.displayOrder();

            System.out.print("Press '1' for Bubble Sort or '2' for Quick Sort: ");
            byte choice=SC.nextByte();
            switch (choice){
                case 1:
                    BubbleSort bubble=BubbleSort.getInstance();
                    bubble.bubbleSort(orders);
                    System.out.println("\nSorted by Bubble Sort:");
                    for (Order o : orders) o.displayOrder();
                    break;
                case 2:
                    QuickSort quick = QuickSort.getInstance();
                    quick.quickSort(orders,0, orders.length-1);
                    System.out.println("\nSorted by Quick Sort:");
                    for (Order o : orders) o.displayOrder();
                    break;
                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }
    }
}