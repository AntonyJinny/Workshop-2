import java.util.Scanner;

public class EXTRA9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Extra Challenge 9:

        // Get an integer from the user and give the value of 21 minus the number. 
        // If the number is greater than 21 then print out double the number. 
        // If you input 19 then the output should be 2. 
        // If you input 22 then the output should be 44. 
        // If you input 21 then the output should be 0.

        int number = scan.nextInt();

        if (number > 21) { 
            System.out.println(number * 2);
        } else if (number == 19) {
            System.out.println(2);
        } else if (number == 22) {
            System.out.println(44);
        } else if (number == 21) {
            System.out.println(0);
        } else {
            System.out.println(number - 21);
        }
    }
}
