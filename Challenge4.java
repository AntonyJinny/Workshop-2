import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 4:

        // Get a length from the user and 
        // print out the area and perimeter of the square but, 
        // print out an error message if the length is less than 0 because a square cannot have a negative length.

        System.out.println("Enter a length for your sqaure.");
        
        double length = scan.nextDouble();

        if(length < 0) {
        System.out.println("ERROR. LENGTH CANNOT BE NEGATIVE");
        } else {
        System.out.println(length * length);
        System.out.println("This is your area.");
        System.out.println(length * 4);
        System.out.println("This is your perimeter.");

        }
    }
}
    

