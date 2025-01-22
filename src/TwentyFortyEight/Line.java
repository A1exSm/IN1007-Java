package TwentyFortyEight;
import java.util.Arrays;

public class Line {
    int[] line;

    Line(int n) {
        this.line = new int[n];
//        String direction = "left";
    }

    public void print() {
        System.out.println(Arrays.toString(line));
    }

    public int[] update(String direction) { // performes operation for the line
        if (direction.equals("left")) {
            zeroPush("left");
            mergeLeft();
            zeroPush("left");
        }
        else if (direction.equals("right")) {
            zeroPush("right");
            mergeRight();
            zeroPush("right");
        } else if (direction.equals("up")) {
            zeroPush("left");
            mergeLeft();
            zeroPush("left");
        } else if (direction.equals("down")) {
            zeroPush("right");
            mergeRight();
            zeroPush("right");
        }
        return line;
    }

    private void mergeLeft() {
        for (int i = 1; i < line.length; i++) {
            if (line[i] == line[i - 1]) { // if the current value is the same as the one to the left
                line[i-1] = line[i] + line[i - 1]; // set the index to the left as the current value + left value
                line[i] = 0; // set the current value to 0
            }
        }
    }
    private void mergeRight() {
        for(int i = line.length-2; i >= 0; i--) {
            if (line[i] == line[i+1]) {
                line[i+1] = line[i] + line[i+1];
                line[i] = 0;
            }
        }
    }

    private void pushLeft() {
        int fillIndex = 0; // index of empty value
        for (int i = 0; i < line.length; i++) {
            if (line[i] != 0) { // if current value is non-zero
                if (i != fillIndex) { // if the current index is not the fill index
                    line[fillIndex] = line[i]; // set empty value location to current value
                    line[i] = 0; // current value index to 0;
                }
                fillIndex++;
            }
        }
    }
    private void pushRight() {
        int fillIndex = line.length - 1;
        for (int i = fillIndex; i >= 0; i--) {
            if (line[i] != 0) {
                if (i != fillIndex) {
                    line[fillIndex] = line[i];
                    line[i] = 0;
                }
                fillIndex--;
            }
        }
    }

    private void zeroPush(String direction) { // function checks whether the line has null values
        boolean isZero = false;
        for (int value : line) {
            if (value == 0) {
                 isZero = true;
                 break;
            }
        }
        if (isZero) {
            if (direction.equals("right")) {
                pushRight();
            } else {
                pushLeft();
            }
        }
    }
    private void pushUp() {}
    private void pushDown() {}
}

