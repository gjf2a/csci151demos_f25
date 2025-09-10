public class TicTacToeBoard {
    private String[][] board;

    public TicTacToeBoard() {
        board = new String[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = "_";
            }
        }
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
        if (board[row][col].equals("_")) {
            return true;
        } else {
            return false;
        }
    }

    public void place(String piece, int row, int col) {
        if (isOpen(row, col)) {
            board[row][col] = piece;
        }
    }

    public static void main(String[] args) {
        TicTacToeBoard b = new TicTacToeBoard();
        System.out.println(b);
    }
}
