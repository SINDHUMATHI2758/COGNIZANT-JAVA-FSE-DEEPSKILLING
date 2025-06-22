//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        if (logger1 == logger2)
            System.out.println("Both Logger1 and Logger2 are same instance");
        else
            System.out.println("Different Instances");
        logger1.Log("Application Started");
        logger2.Log("User Clicked the Button");
    }
}