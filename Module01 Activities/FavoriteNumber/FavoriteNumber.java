import java.util.Scanner;

public class FavoriteNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter your favorite number: ");

        int favoriteNumber = myObj.nextInt();
        System.out.println("Your favorite number is " + favoriteNumber);

        myObj.close();
    }
}
