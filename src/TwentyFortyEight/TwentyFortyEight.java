package TwentyFortyEight;

import weekThree.WeekThree;

import java.util.Arrays;

public class TwentyFortyEight {
    WeekThree weekThree = new WeekThree();
    public void run() {
        if (weekThree.inputString("Would you like to play 2048 (y/n):\n").equalsIgnoreCase("y")) {
            game();
        }
    }

    public void game() {
        int size = weekThree.inputInt("What size game do you want to play?\n");
        Grid screen = new Grid(size);
        boolean notFortyEight = true;
        while (notFortyEight) {
            System.out.println();
            printScreen(screen);
            String direction = getDirection();
            if (direction.equals("up") || direction.equals("down")) {
                for(int i = 0; i < screen.grid.length; i++) {
                    Line temp = screen.getColumn(i);
                    int[] lineArray = temp.update(direction);
                    for (int j = 0; j < screen.grid[0].length; j++) {
                        screen.grid[j][i] = lineArray[j];
                    }
                }
            } else if (direction.equals("left") || direction.equals("right")) {
                for(int i = 0; i < screen.grid.length; i++) {
                    Line temp = screen.getRow(i);
                    int[] lineArray = temp.update(direction);
                    for (int j = 0; j < screen.grid[0].length; j++) {
                        screen.grid[i][j] = lineArray[j];
                    }
                }
            }
            System.out.println();
            printScreen(screen);
            notFortyEight = checkFortyEight(screen);
            int[] rand = randomPosition(screen);
            screen.grid[rand[0]][rand[1]] = 2;
            rand = randomPosition(screen);
            screen.grid[rand[0]][rand[1]] = 2;
        }
    }

    private String getDirection() {
        int number = weekThree.inputInt("1. for left\n2. for right\n3. for up\n4 for down");
        String direction = "";
        switch (number) {
            case 1:
                direction = "left";
                break;
            case 2:
                direction = "right";
                break;
            case 3:
                direction = "up";
                break;
            case 4:
                direction = "down";
                break;
            default:
                System.out.println("error");
        }
        return direction;
    }
    private int[] randomPosition(Grid screen) {
        int[] rand = new int[2];
        while (true) {
            rand[0] = (int) (Math.random() * screen.grid.length);
            rand[1] = (int) (Math.random() * screen.grid.length);
            if (screen.grid[rand[0]][rand[1]] == 0) {
                break;
            }
        }
        return rand;
    }
    private void printScreen(Grid screen) {
        for (int[] row : screen.grid) {
            System.out.println(Arrays.toString(row));
        }
    }
    private boolean checkFortyEight(Grid screen) {
        for (int i = 0; i < screen.grid.length; i++) {
            for (int j = 0; j < screen.grid[0].length; j++) {
                if (screen.grid[i][j] == 2048) {
                    return false;
                }
            }
        }
        return true;
    }
}
