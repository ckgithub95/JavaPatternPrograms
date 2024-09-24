// Pattern.java
public class Pattern {
    
    /*
    Q1: Function to print a square star pattern.
    Example:
        If user_input is 4, it prints:
        ****
        ****
        ****
        ****
    */
    public static void printSquarePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Q2: Function to print a right-angle triangle star pattern.
    Example:
        If user_input is 4, it prints:
        ****
        ***
        **
        *
    */
    public static void printTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= (size - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    /*
    Q3: Function to print a right-angle triangle pattern with alternating stars and even numbers.
    Example:
        If the user input is 4, the output should be:
        *
        *2
        *2*4
        *2*4*
    */
    public static void printTrianglePatternEvenNum(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(j);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    /*
    Q4: Function to print a right-angle triangle pattern with alternating numbers and stars.
    Example:
        If the user input is 6, the output should be:
        1
        1*
        1*2
        1*2*3
        1*2*3*
    */
    public static void printTrianglePatternNum(int size) {
        for (int i = 1; i <= size; i++) {
            int k = 1;
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }
    }

    /*
    Q5: Function to print a left-angle triangle pattern with stars.
    Example:
        If the user input is 5, the output should be:
              *
             **
            ***
           ****
          *****
    */
    public static void printLeftTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    Q6: Function to print an inverted right-angle triangle pattern aligned to the right.
    Example:
        If the user input is 4, the output should be:
        ****
         ***
          **
           *
    */
    public static void printRightDownTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            // Leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (size - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    /*
    Q7: Function to print an inverted right-angle triangle pattern aligned to the right.
    Example:
        If the user input is 4, the output should be:
        ********
        ***  ***
        **    **
        *      *
    */
    public static void printRightLeftTrianglePattern(int size) {
        for (int i = 1; i <= size; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 1; j <= (2 * (size - i)); j++) {
                System.out.print(" ");
            }
            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
    Q8: Function to print an inverted right-angle triangle pattern aligned to the right.
    Example:
        If the user input is 4, the output should be:
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        **      **
        ***    ***
        ****  ****
        **********
    */
    public static void printSymmetricalPattern(int size) {
        // Upper part
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (size - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
