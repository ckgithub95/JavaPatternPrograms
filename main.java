// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user for input size
        System.out.print("Enter the number of rows/columns for the pattern: ");
        int size = sc.nextInt();

        // Call the functions from Pattern.java
        System.out.println("Square Pattern:");
        Pattern.printSquarePattern(size);

        System.out.println("Right-Angle Triangle Pattern:");
        Pattern.printTrianglePattern(size);

        System.out.println("Right-Angle Triangle Pattern with Even Numbers:");
        Pattern.printTrianglePatternEvenNum(size);

        System.out.println("Right-Angle Triangle Pattern with Numbers and Stars:");
        Pattern.printTrianglePatternNum(size);

        System.out.println("Left-Angle Triangle Pattern:");
        Pattern.printLeftTrianglePattern(size);

        System.out.println("Inverted Right-Angle Triangle Pattern:");
        Pattern.printRightDownTrianglePattern(size);

        sc.close();
    }
}
