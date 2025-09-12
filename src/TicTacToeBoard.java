import java.util.Scanner;

public class TicTacToeBoard {
    private TicTacToeValue[][] board;

    public TicTacToeBoard() {
        board = new TicTacToeValue[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = TicTacToeValue.EMPTY;
            }
        }
    }

    public boolean gameOver() {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col].isOpen()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                result += board[row][col] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean isOpen(int row, int col) {
        return board[row][col].isOpen();
    }

    public void place(TicTacToeValue piece, int row, int col) {
        if (isOpen(row, col)) {
            board[row][col] = piece;
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard b = new TicTacToeBoard();

        TicTacToeValue currentPlayer = TicTacToeValue.X;
        Scanner scan = new Scanner(System.in);
        while (!b.gameOver()) {
            System.out.println(b);
            System.out.println("It is the turn of " + currentPlayer);
            System.out.print("Enter row (0, 1, 2): ");
            int row = scan.nextInt();
            System.out.print("Enter column: (0, 1, 2): ");
            int col = scan.nextInt();
            if (b.isOpen(row, col)) {
                b.place(currentPlayer, row, col);
                currentPlayer = currentPlayer.opponent();
            } else {
                System.out.println("That was not a legal move. Try again.");
            }
        }
    }
}
