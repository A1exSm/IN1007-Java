package weekThree;
import java.util.Scanner;

public class WeekThree {
    public void greet(String[] arguments) {
        //Checks whether any arguments have been provided, and gives an appropriate greeting.
        if (arguments.length > 0) System.out.println("Hello " + arguments[0]);
        else System.out.println("Hello");
    }
//This function is no longer needed.
//    public void input(String selection) {
//        String string;
//        int integer;
//        Scanner sc = new Scanner(System.in);
//        System.out.println();
//        if (selection.equals("String")) {
//            string = sc.nextLine();
//            System.out.println(string);
//        } else if (selection.equals("Integer")) {
//            integer = sc.nextInt();
//            System.out.println(integer);
//        }
//    }

    public String inputString(String statement) {
        Scanner sc = new Scanner(System.in);
        System.out.println(statement);
        return sc.nextLine();
    }

    public void exerciseFive() {
        String name_of_the_TA = inputString("Please enter the name of a TA:\n");
        String name_of_the_student = inputString("Please enter your name:\n");
        System.out.println("Dear " + name_of_the_TA + ",\nI enjoy your tutorials, they are awesome!\n" + name_of_the_student + ".");
    }


}
