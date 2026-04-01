public class CommisionEmployee extends Employee {
    private double baseSalary;
    private double salesAmount;
    private double commissionRate;
    public CommisionEmployee(String name, String id, double baseSalary, double salesAmount, double commissionRate) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }
    public double calculateMonthlySalary() throws InvalidSalaryException {
        if (baseSalary < 0 || salesAmount < 0 || commissionRate < 0 || commissionRate > 1) {
            throw new InvalidSalaryException("Invalid commission data");
        }
        return baseSalary + (salesAmount * commissionRate);
    }
}