import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
       
        System.out.print("Enter a noun: ");
        String noun = myObj.nextLine();

        System.out.print("Enter a verb: ");
        String verb = myObj.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = myObj.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = myObj.nextLine();

      
        String story = "Once upon a time, there was a " + adjective + " " + noun + " that loved to " + verb + " " + adverb + ".";
        story += " It became famous for its ability to " + verb + " faster than anyone else!";

        System.out.println("\nHere is your story:");
        System.out.println(story);

        myObj.close();
    }
}
