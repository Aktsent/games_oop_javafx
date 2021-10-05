package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 0 && Win.horizont(board, i) || Win.vertical(board, i)) {
                    rsl = false;
                    break;
            }
        }
        return rsl;
    }

    public static boolean horizont(int[][] board, int row) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 0) {
                    rsl = true;
                    break;
                }
        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int column) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
                if (board[i][column] != 0) {
                    rsl = true;
                    break;
                }
        }
        return rsl;
    }
}
