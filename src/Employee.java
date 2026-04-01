public abstract class Employee {
    protected String name;
    protected String id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateMonthlySalary() throws InvalidSalaryException;
    public double printPaySlip() {
        try {
            double salary = calculateMonthlySalary();
            System.out.println(name + " (" + id + ") Salary: " + salary);
            return salary;
        } catch (InvalidSalaryException e) {
            System.out.println("Error for " + name + ": " + e.getMessage());
            return 0;
        }
    }
}