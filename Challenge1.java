import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 1:
        
        // Get user input with the user's name and print out:
        // "Hello [Name]". For example if the user's name is Bob then the output should be "Hello Bob".


        // These are 4 scan types:

            // String ______ = scan.nextLine();
            // int ______ = scan.nextInt();
            // double ______ = scan.nextDouble();
            // boolean ______ = scan.nextBoolean();
            

        System.out.println("Please type in your name below.");
        String poop = scan.nextLine();
        System.out.println("Hello " + poop); 
    }
}
