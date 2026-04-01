public class InsufficientFundaException extends Exception {
    private double shortfall;

    public InsufficientFundaException(double shortfall) {
        this.shortfall = shortfall;
    }
    @Override
    public String getMessage() {
        return ("Insufficient funds. You are short by $" +  shortfall+"0");
    }
}