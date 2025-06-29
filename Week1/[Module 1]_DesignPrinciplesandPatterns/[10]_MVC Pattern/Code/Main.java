public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ravi", "S101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        System.out.println("=== Initial Student Details ===");
        controller.updateView();

        System.out.println("\n=== Updating Student Details ===");
        controller.setStudentName("Ravi Kumar");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
