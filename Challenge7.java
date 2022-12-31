import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 7:

        // Get a number from the user and print out the factorial of the number.
        // Lets say the user enters 5 then print the value of 5 * 4 * 3 * 2 * 1. 
        // If the user enters 7 then print the value of 7 * 6 * 5 * 4 * 3 * 2 * 1. 
        // If the user enters 2 then print the value of 2 * 1. 
        // If the user enters 0 then print the value of 1.
        

        
        // A kind statement for the user :)
        System.out.println("Please enter a number below.");

        // Gets the user's number
        int number = scan.nextInt();

        // Set an integer of i = to 1, so  we start from 1-2-3-4..etc depending on the int number. 
        // Can't be 0.
        int i = 1;

        // Output = 1 so it can be a holder to our output value. Can't be 0.
        int output = 1;
        
        // While loop where our int i will be less than or equal to the user's number.
        // This loop will continue to run UNTIL i is NOT <= number and will run to the print statement.
        while (i <= number) {

        // The output would equal to output * i where it is in the while loop 
        // and i adds by 1 from i++ until is is <= number.
        output = output * i;
        i++; 
        }

        // Print the factorial of the user's number.
        System.out.println("The factorial of " + number + " is: " + output);
        

    }
}


    