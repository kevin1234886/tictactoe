import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Players
        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Step 1: Randomly decide who starts (0 or 1)
        Random random = new Random();
        int toss = random.nextInt(2); // 0 or 1

        // Step 2: Assign symbols and decide first turn
        if (toss == 0) {
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
            currentSymbol = player1Symbol;
        } else {
            player1Symbol = 'O';
            player2Symbol = 'X';
            currentPlayer = player2;
            currentSymbol = player2Symbol;
        }

        // Step 3: Display results
        System.out.println("=== Game Start ===");
        System.out.println(player1 + " is '" + player1Symbol + "'");
        System.out.println(player2 + " is '" + player2Symbol + "'");
        System.out.println(currentPlayer + " will start first!");
        System.out.println("Current Symbol: " + currentSymbol);
    }
}
