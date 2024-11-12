package TwentyFortyEight;

public class Line {
    int[] line;

    Line(int n) {
        this.line = new int[n];
    }

    public void update(String direction) {
        if (direction.equalsIgnoreCase("left")) {
            for (int i = 1; i < line.length; i++) {
                if (line[i] == line[i - 1]) {
                    line[i-1] = line[i] + line[i - 1];
                    line[i] = 0;
                }
            }
        }
    }
}
