package examples;

public class Array2Demo {
    public static void main(String[] args) {
        // Row-major order
        int[][] n = new int[3][2];
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
            for (int j = 0; j < n[i].length; j++)  {
                System.out.println(i + ", " + j + ": " + n[i][j]);
            }
        }

        for (int row = 0; row < n.length; row++) {
            for (int col = 0; col < n[row].length; col++) {
                System.out.print(n[row][col] + " ");
            }
            System.out.println();
        }

        boolean[][] tfs = new boolean[3][2];
        for (int row = 0; row < tfs.length; row++) {
            for (int col = 0; col < tfs[row].length; col++) {
                System.out.print(tfs[row][col] + " ");
            }
            System.out.println();
        }

        String[][] ss = new String[3][2];
        for (int row = 0; row < ss.length; row++) {
            for (int col = 0; col < ss[row].length; col++) {
                System.out.print(ss[row][col] + " ");
            }
            System.out.println();
        }
    }
}
