import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter name: ");

        String name = myObj.nextLine();
        System.out.println("Your name is " + name);

        myObj.close();
    }
}
