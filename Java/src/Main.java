import weekThree.WeekThree;
import weekFour.WeekFour;
import weekFive.WeekFive;

public class Main {
    public static void main(String[] args) {
        WeekThree weekThree = new WeekThree();
        WeekFour weekFour = new WeekFour();
        WeekFive weekFive = new WeekFive();
        // run methods
        weekThree.run(args);
        weekFour.run();
        weekFive.run();
    }
}