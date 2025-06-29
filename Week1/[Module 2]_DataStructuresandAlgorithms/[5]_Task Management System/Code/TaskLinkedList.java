public class TaskLinkedList {
    private Node head;


    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        System.out.println("Task added.");
    }


    public Task searchTask(int id) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }


    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }

        Node current = head;
        while (current != null) {
            current.task.displayTask();
            current = current.next;
        }
    }


    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.task.taskId != id) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task deleted.");
        }
    }
}
