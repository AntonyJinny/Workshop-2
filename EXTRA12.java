import java.util.Scanner;

public class EXTRA12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Extra Challenge 12:

        // Get as many numbers from the user until the user types a 0.
        //  Add the absolute value of all the numbers and print out the sum. 
        //  For example if the user enters 1, -2, 3, -4, 0 then the output should be 10.


        int number = scan.nextInt();
        int total = 0;

        while ((number > 0) || (number < 0)) {
            total = total + Math.abs(number);
            number = scan.nextInt();
            if (number == 0) {
                System.out.println(total);
            }
        }

    }
}



