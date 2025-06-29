public class Main {
    public static void main(String[] args) {
        Notifier email = new EmailNotifier();

        Notifier emailAndSMS = new SMSNotifierDecorator(email);

        Notifier allChannels = new SlackNotifierDecorator(emailAndSMS);

        System.out.println("=== Sending via Email Only ===");
        email.send("Your package has been shipped.");

        System.out.println("\n=== Sending via Email + SMS ===");
        emailAndSMS.send("Your OTP is 123456.");

        System.out.println("\n=== Sending via Email + SMS + Slack ===");
        allChannels.send("Server is down!");
    }
}
