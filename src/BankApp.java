public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.00);
        System.out.println("Balance: $" + account.getBalance() +"0");
        double[] withdrawals = {200, 400, 100};
        for (double amount : withdrawals) {
            try {
                account.withdraw(amount);
            } catch (InsufficientFundaException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}