import java.util.Scanner;

public class EXTRA10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Extra Challenge 10:

        // Get a number from the user and print out if the number is a multiple of 3 or 5. 
        // For example if the user enters 15 then the output should be 15 is a multiple of 3 and 5. 
        // If the user enters 9 then the output should be 9 is a multiple of 3. 
        // If the user enters 10 then the output should be 10 is a multiple of 5. 
        // If the user enters 7 then the output should be 7 is not a multiple of 3 or 5.

        int number = scan.nextInt();

        if ((number % 5 == 0) && (number % 3 == 0 )) {
            System.out.println(number + " is a multiple of both 3 & 5.");
        } else if ( number % 5 == 0 ) {
            System.out.println( number + " is a multiple of 5.");
        } else if ( number % 3 == 0 ) {
            System.out.println( number + " is a multiple of 3.");
        } else {
            System.out.println(number + " is NOT a multiple of 3 or 5.");
        }
    }
}
