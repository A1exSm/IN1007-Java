package weekNine;
import weekThree.WeekThree;
public class WeekNine {
    WeekThree weekThree = new WeekThree();
    public void run() {
        switch (weekThree.inputInt("Which function would you like to run? ")) {
            case 1 -> exerciseOne();
            case 2 -> exerciseTwo();
            default -> System.out.println("Invalid input");
        }
    }
    private void exerciseOne(){
        Circle one = new Circle();
        Circle two = new Circle(5);
        Circle three = new Circle(8);
        System.out.println(three.getTotalSurface());
    }

    private void printWages(Company company) {
        Employee[] employees = company.getListOfEmployees().clone();
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Wage: " + employee.getJob().getWage());
        }
    }

    private void exerciseTwo(){
        Job manager = new Job("manager", 3000);
        Company myCompany = new Company("mycompany", 0 );
        Employee alex = new Employee("Alex", manager, myCompany);
        printWages(myCompany);
    }
}
