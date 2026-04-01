class TaxableProduct extends Product implements Taxable {
    TaxableProduct(String name, double price) {
        super(name, price);
    }
    @Override
    public double calculateTax() {
        return price * TAX_RATE;
    }
    @Override
    public void print() {
        double tax = calculateTax();
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (price + tax));
    }
}