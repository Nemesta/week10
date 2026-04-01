public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Nick", "1", 50000000);
        employees[1] = new PartTimeEmployee("Davideus", "2", 10, 400);
        employees[2] = new CommisionEmployee("Hercalus", "3", 500, 1200, 0.1);
        double total = 0;
        for (int i = 0; i < employees.length; i++) {
            total = total + employees[i].printPaySlip();
        }
        System.out.println("Total payroll: " + total);
    }
}