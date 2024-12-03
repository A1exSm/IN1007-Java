import weekNine.WeekNine;
import weekThree.WeekThree;
import weekFour.WeekFour;
import weekFive.WeekFive;
import weekSeven.WeekSeven;
import TwentyFortyEight.TwentyFortyEight;
import weekEight.WeekEight;
import weekNine.WeekNine;

public class Main {
    public static void main(String[] args) {
        WeekThree weekThree = new WeekThree();
        WeekFour weekFour = new WeekFour();
        WeekFive weekFive = new WeekFive();
        WeekSeven weekSeven = new WeekSeven();
        TwentyFortyEight twentyFortyEight = new TwentyFortyEight();
        WeekEight weekEight = new WeekEight();
        WeekNine weekNine = new WeekNine();
        // run methods
        while (weekThree.inputString("Do you want to run this programme (y/n)").equalsIgnoreCase("y")) {
            switch (weekThree.inputInt("Which Week would you like to run? (3,4,5,7,8,9 & 2048)")) {
                case 3 -> weekThree.run(args);
                case 4 -> weekFour.run();
                case 5 -> weekFive.run();
                case 7 -> weekSeven.run();
                case 8 -> weekEight.run();
                case 9 -> weekNine.run();
                case 2048 -> twentyFortyEight.run();
                default -> System.out.println("Invalid input");
            }
        }
    }
}