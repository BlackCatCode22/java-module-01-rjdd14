import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char character = myObj.next().charAt(0);

        int unicodeValue = (int) character;
        System.out.println("Unicode value of '" + character + "' is: " + unicodeValue);

        if (Character.isLetter(character)) {
            System.out.println("'" + character + "' is a letter.");
        } else if (Character.isDigit(character)) {
            System.out.println("'" + character + "' is a digit.");
        } else {
            System.out.println("'" + character + "' is neither a letter nor a digit.");
        }

        myObj.close();
    }
}
