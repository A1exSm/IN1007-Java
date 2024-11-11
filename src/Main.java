import weekThree.WeekThree;
import weekFour.WeekFour;
import weekFive.WeekFive;
import weekSeven.WeekSeven;
public class Main {
    public static void main(String[] args) {
        WeekThree weekThree = new WeekThree();
        WeekFour weekFour = new WeekFour();
        WeekFive weekFive = new WeekFive();
        WeekSeven weekSeven = new WeekSeven();
        // run methods
        weekThree.run(args);
        weekFour.run();
        weekFive.run();
        weekSeven.run();
    }
}