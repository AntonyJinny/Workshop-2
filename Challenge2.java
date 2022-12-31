import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Challenge 2:

        // Get a length from the user and 
        // print out the area and perimeter of a square with the length given.
    
        double length = scan.nextDouble();
        
        System.out.println(length * length);
        System.out.println(length * 4);

    }
}
