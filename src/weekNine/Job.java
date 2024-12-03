package weekNine;

class Job {
    private String name;
    private int wage;
    // constructor
    protected Job(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }
    // getters and setters
    protected void setName(String name) {
        this.name = name;
    }
    protected String getName() {
        return name;
    }
    protected void setWage(int wage) {
        this.wage = wage;
    }
    protected int getWage() {
        return wage;
    }
}
