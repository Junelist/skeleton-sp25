package tester2048;

import game2048logic.GameLogic;
import org.junit.Test;

import static com.google.common.truth.Truth.assertWithMessage;
import static tester2048.TestUtils.boardToString;

public class MyTest {
    @Test
    public void Testtiltrol() {
        int[][] board = {
                {2, 2, 2, 2},
                {0, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0}
        };

        GameLogic.tiltrol(board, 0);

        int[][] expected = {
                {4, 4, 0, 0},
                {0, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0}
        };

        assertWithMessage("Boards should match:").that(boardToString(board)).isEqualTo(boardToString(expected));
    }

    @Test
    public void Testtilteast() {
        int[][] board = {
                {2, 2, 2, 2},
                {0, 0, 0, 0},
                {0, 2, 0, 0},
                {0, 0, 0, 0}
        };

        GameLogic.tiltwest(board);

        int[][] expected = {
                {4, 4, 0, 0},
                {0, 0, 0, 0},
                {2, 0, 0, 0},
                {0, 0, 0, 0}
        };

        assertWithMessage("Boards should match:").that(boardToString(board)).isEqualTo(boardToString(expected));
    }


}
