import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = myObj.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = myObj.nextDouble();

        System.out.println("Results:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        myObj.close();
    }

}
