import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 5:
        
        // Get a boolean from the user and print out the opposite of the boolean. 
        // For example if the user enters true then the output should be false.

        boolean pee = scan.nextBoolean();

        System.out.println(!(pee));
        

    }
}

