public class FullTimeEmployee extends Employee {
    private double annualSalary;
    public FullTimeEmployee(String name, String id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }
    public double calculateMonthlySalary() throws InvalidSalaryException {
        if (annualSalary <= 0) {
            throw new InvalidSalaryException("Invalid annual salary");
        }
        return annualSalary / 12;
    }
}