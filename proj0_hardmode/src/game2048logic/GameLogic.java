package game2048logic;

import game2048rendering.Side;
import static game2048logic.MatrixUtils.rotateLeft;
import static game2048logic.MatrixUtils.rotateRight;

/**
 * @author  Josh Hug
 */
public class GameLogic {
    /**
     * Modifies the board to simulate tilting the entire board to
     * the given side.
     *
     * @param board the current state of the board
     * @param side  the direction to tilt
     */
    public static void tilt(int[][] board, Side side) {
        // fill this in
        if (side == Side.NORTH) {
            rotateLeft(board);
            tiltwest(board);
            rotateRight(board);
        } else if (side == Side.EAST) {
            rotateLeft(board);
            rotateLeft(board);
            tiltwest(board);
            rotateRight(board);
            rotateRight(board);
        } else if (side == Side.WEST) {
            tiltwest(board);
        } else { // SOUTH
            rotateRight(board);
            tiltwest(board);
            rotateLeft(board);
        }
    }

    public static void tiltrol(int[][] board, int rol) {
        int[] arr = new int[board[rol].length];
        int pos = 0;
        for (int i = 0; i < board[rol].length; i++) {
            if (board[rol][i] != 0) {
                arr[pos++] = board[rol][i];
            }
        }

        for (int i = 0; i < pos - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        int i = 0;
        int j = 0;
        while (j < board[rol].length) {
            if (i < pos && arr[i] != 0) {
                board[rol][j++] = arr[i];
            } else if (i >= pos) {
                board[rol][j++] = 0;
            }

            i++;
        }
    }

    public static void tiltwest(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            tiltrol(board, i);
        }
    }
}
