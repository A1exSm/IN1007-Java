import weekThree.WeekThree;
import weekFour.WeekFour;
import weekFive.WeekFive;
import weekSeven.WeekSeven;
import TwentyFortyEight.TwentyFortyEight;
import weekEight.WeekEight;

public class Main {
    public static void main(String[] args) {
        WeekThree weekThree = new WeekThree();
        WeekFour weekFour = new WeekFour();
        WeekFive weekFive = new WeekFive();
        WeekSeven weekSeven = new WeekSeven();
        TwentyFortyEight twentyFortyEight = new TwentyFortyEight();
        WeekEight weekEight = new WeekEight();
        // run methods
        while (weekThree.inputString("Do you want to run this programme (y/n)").equalsIgnoreCase("y")) {
            weekThree.run(args);
            weekFour.run();
            weekFive.run();
            weekSeven.run();
            twentyFortyEight.run();
            weekEight.run();
        }
    }
}