import java.util.Scanner;

public class Challenge6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 6:
        
        // Get a number from a user and print out if the number is even or odd. 
        // For example if the user enters 5 then the output should be 5 is odd.

        int number = scan.nextInt();  

        if (number % 2 == 0 ) {
            System.out.println( number + " is even.");
        } else {
          System.out.println( number + " is odd.");
        }
    }
}
