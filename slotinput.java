import java.util.Scanner;

public class TicTacToe {

    // Method to get slot input from user
    public static int getUserMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();  // Read integer input

        return slot; // Return the entered value
    }

    public static void main(String[] args) {

        // Call method
        int userMove = getUserMove();

        // Display entered value
        System.out.println("You selected slot: " + userMove);
    }
}
