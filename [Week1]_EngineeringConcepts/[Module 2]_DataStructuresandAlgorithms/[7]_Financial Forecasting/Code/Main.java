import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter the principal ");
        double principal = SC.nextDouble();
        System.out.print("Enter the rate of interest ");
        double roi = SC.nextDouble();
        System.out.print("Enter the number of years ");
        int years = SC.nextInt();
        double prediction = futureValue(principal,roi,years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, prediction);
    }
    public static double futureValue(double principal, double roi, int years){
        if(years==0)
            return principal;
        return futureValue(principal,roi,years-1)*(1+roi) ;
    }
}