import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        int fahrenheitTemp = myObj.nextInt();

        double celsiusTemp = (fahrenheitTemp - 32) * 5.0 / 9.0;

        System.out.print("The temperature in Celsius is: " + celsiusTemp);

        myObj.close();
    }
}
