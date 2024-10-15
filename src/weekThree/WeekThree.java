package weekThree;
public class WeekThree {
    public void greet(String[] arguments) {
        //Checks whether any arguments have been provided, and gives an appropriate greeting.
        if (arguments.length > 0) System.out.println("Hello " + arguments[0]);
        else System.out.println("Hello");
    }
}
