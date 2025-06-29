import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Book[] book={
                new Book(101,"To Kill a Mockingbird","Harper Lee"),
                new Book(102,"1984","George Orwell"),
                new Book(103,"Pride and Prejudice","Jane Austen"),
                new Book(104,"The Alchemist","Paulo Coelho"),
                new Book(105,"The Great Gatsby"," F. Scott Fitzgerald")
        };
        System.out.print("Enter Book Title to Search: ");
        String title=SC.nextLine();
        System.out.print("Press '1' for Linear Search or Press '2' for Binary Search ");
        byte choice = SC.nextByte();
        switch(choice){
            case 1:
                LinearSearch linear = LinearSearch.getInstance();
                linear.linearSearch(book,title);
                break;
            case 2:
                BinarySearch binary = BinarySearch.getInstance();
                binary.binarySearch(book,title);
                break;
            default:
                System.out.println("Enter valid Choice");
                break;
        }

    }
}