package weekNine;

class Employee {
    private String name;
    private Job job;
    private Company company;
    // constructor
    protected Employee(String name, Job job, Company company) {
        this.name = name;
        this.job = job;
        this.company = company;
        company.newEmployee(this);
    }
    // getter and setters
    protected void setName(String name) {
        this.name = name;
    }
    protected void setJob(Job job) {
        this.job = job;
    }
    protected void setCompany(Company company) {
        this.company = company;
    }
    protected String getName() {
        return name;
    }
    protected Job getJob() {
        return job;
    }
    protected Company getCompany() {
        return company;
    }
}
