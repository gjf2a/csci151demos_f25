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

    public TicTacToeValue getWinner() {
        if (isWinner(TicTacToeValue.X)) {
            return TicTacToeValue.X;
        } else if (isWinner(TicTacToeValue.O)) {
            return TicTacToeValue.O;
        } else {
            return TicTacToeValue.EMPTY;
        }
    }

    public boolean isWinner(TicTacToeValue player) {
        return isHorizontalWinner(player) || isVerticalWinner(player) || isDiagonalWinner(player);
    }

    private boolean isDiagonalWinner(TicTacToeValue player) {
        return positiveDiagonalWinner(player) || negativeDiagonalWinner(player);
    }

    private boolean negativeDiagonalWinner(TicTacToeValue player) {
        for (int row = 0; row < board.length; row++) {
            int col = board.length - 1 - row;
            if (board[row][col] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean positiveDiagonalWinner(TicTacToeValue player) {
        for (int pos = 0; pos < board.length; pos++) {
            if (board[pos][pos] != player) {
                return false;
            }
        }
        return true;
    }

    private boolean isVerticalWinner(TicTacToeValue player) {
        for (int col = 0; col < board[0].length; col++) {
            boolean everyoneIsPlayer = true;
            for (int row = 0; row < board.length; row++) {
                if (board[row][col] != player) {
                    everyoneIsPlayer = false;
                }
            }
            if (everyoneIsPlayer) {
                return true;
            }
        }
        return false;
    }

    private boolean isHorizontalWinner(TicTacToeValue player) {
        for (int row = 0; row < board.length; row++) {
            boolean everyoneIsPlayer = true;
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] != player) {
                    everyoneIsPlayer = false;
                }
            }
            if (everyoneIsPlayer) {
                return true;
            }
        }
        return false;
    }

    public boolean gameOver() {
        return boardIsFull() || getWinner() != TicTacToeValue.EMPTY;
    }

    public boolean boardIsFull() {
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

        if (b.getWinner() == TicTacToeValue.EMPTY) {
            System.out.println("The game was tied.");
        } else {
            System.out.println(b.getWinner() + " won the game!");
        }
    }
}
