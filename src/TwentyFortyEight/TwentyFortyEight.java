package TwentyFortyEight;

import weekThree.WeekThree;

public class TwentyFortyEight {
    WeekThree weekThree = new WeekThree();
    public void run() {
        Grid screen = new Grid(8);
        while (true) {
            String direction = getDirection();

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
}
