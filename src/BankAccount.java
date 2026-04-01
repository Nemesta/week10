public class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientFundaException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientFundaException(shortfall);
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount +"0"+
                    ". Remaining balance: $" +  balance+"0");
        }
    }
    public double getBalance() {
        return balance;
    }
}