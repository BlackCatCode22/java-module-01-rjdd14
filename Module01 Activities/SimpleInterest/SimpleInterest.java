import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = myObj.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = myObj.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = myObj.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.printf("The simple interest is: %.2f%n", simpleInterest);

        myObj.close();
    }
}