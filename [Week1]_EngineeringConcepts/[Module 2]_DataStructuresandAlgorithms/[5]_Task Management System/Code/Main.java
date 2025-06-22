import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskLinkedList list = new TaskLinkedList();

        int choice;
        do {
            System.out.println("\n--- Task Management Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();
                    list.addTask(new Task(id, name, status));
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    int searchId = sc.nextInt();
                    Task t = list.searchTask(searchId);
                    if (t != null) {
                        t.displayTask();
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    list.displayTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    int deleteId = sc.nextInt();
                    list.deleteTask(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
