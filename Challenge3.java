import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 3:

        // Get a radius from the user and 
        // print out the area and 
        // circumference of a circle with the radius given.

        System.out.println("Please type in the radius for your imaginary circle below.");

        double radius = scan.nextDouble();
        
        System.out.println(3.14 * radius * radius );
        System.out.println("This is your area of your circle.");
        System.out.println( 2 * 3.14 * radius);
        System.out.println("This is the circumfrence of your circle.");

    }
}
