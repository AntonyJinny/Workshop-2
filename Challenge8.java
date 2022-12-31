import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Challenge 8:

        // Keep asking the user for numbers until they enter a negative number. 
        // Add up all the numbers the user enters and print out the sum.

        int number = scan.nextInt();
        int total = 0;

        while (number > 0) {
            total += number;
            number = scan.nextInt();
            if (number < 0) {
                System.out.println(total);
            }
        }

        
    }
}
