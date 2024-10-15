package weekThree;
import java.util.Scanner;

public class WeekThree {
    public void greet(String[] arguments) {
        //Checks whether any arguments have been provided, and gives an appropriate greeting.
        if (arguments.length > 0) System.out.println("Hello " + arguments[0]);
        else System.out.println("Hello");
    }
    public void input(String selection) {
        String string;
        int integer;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        if (selection.equals("String")) {
            string = sc.nextLine();
            System.out.println(string);
        } else if (selection.equals("Integer")) {
            integer = sc.nextInt();
            System.out.println(integer);
        }
    }
}
