package weekNine;

class Company {
    private String name;
    private int numberOfEmployees = 0;
    private Employee[] listOfEmployees;
    // constructor
    protected Company(String name, int numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.listOfEmployees = new Employee[numberOfEmployees];
    }
    // getters and setters
    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }
    protected void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    protected int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    protected void setListOfEmployees(Employee[] listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }
    protected Employee[] getListOfEmployees() {
        return listOfEmployees;
    }
    protected void newEmployee(Employee newEmployee) {
        if (this.numberOfEmployees > 0) {
            this.numberOfEmployees++;
            Employee[] temp = new Employee[numberOfEmployees];
            for (int i = 0; i < numberOfEmployees - 1; i++) {
                temp[i] = listOfEmployees[i];
            }
            this.listOfEmployees = temp;
        } else {
            this.numberOfEmployees++;
            this.listOfEmployees = new Employee[1];
            this.listOfEmployees[0] = newEmployee;
        }
    }
}
