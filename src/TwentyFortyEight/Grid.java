package TwentyFortyEight;

import java.util.Arrays;

public class Grid {
    int[][] grid;

    Grid(int n) {
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = 0;
            }
        }
        grid[0][0] = 2;
    }

    public Line getRow(int rowNumber) {
        Line row = new Line(grid.length);
        for (int i = 0; i < grid[rowNumber].length; i++) {
            row.line[i] = grid[rowNumber][i];
        }
        return row;
    }

    public Line reverseRow(int rowNumber) {
        Line row = new Line(grid.length);
        for (int i = 0; i < grid.length; i++) {
            row.line[grid.length - 1 - i] = grid[rowNumber][i];
        }
        return row;
    }

    public Line getColumn(int columnNumber) {
        Line column = new Line(grid.length);
        for (int i = 0; i < grid.length; i++) {
            column.line[i] = grid[i][columnNumber];
        }
        return column;
    }

    public Line reverseColumn(int columnNumber) {
        Line column = new Line(grid.length);
        for (int i = 0; i < grid.length; i++) {
            column.line[grid.length - 1 - i] = grid[i][columnNumber];
        }
        return column;
    }

}
