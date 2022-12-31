import java.util.Scanner;

public class EXTRA11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 11:

        // Ask for a number from the user for the base and a number for the exponent. 
        // Print out the value of the base to the power of the exponent. 
        // For example if the user enters 2 for the base and 3 for the exponent then the output should be 8. 
        // If the user enters 3 for the base and 2 for the exponent then the output should be 9.
        


        // Scan line for an integer from the user for the base.
       
        System.out.println("Please enter a number for your base.");
        int number1 = scan.nextInt();

        // Scan line for an integer from the user for the exponent.

        System.out.println("Please enter a number for your exponent.");
        int number2 = scan.nextInt();

        // Print out the result from number1^number2 by using Math.pow from the math library.

        System.out.println(Math.pow(number1, number2));
        
    }
}
