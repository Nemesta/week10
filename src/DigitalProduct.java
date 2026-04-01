class DigitalProduct extends TaxableProduct {
    String downloadUrl;
    DigitalProduct(String name, double price, String downloadUrl) {
        super(name, price);
        this.downloadUrl = downloadUrl;
    }
    @Override
    public void print() {
        double tax = calculateTax();
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + (price + tax));
        System.out.println("Download URL: " + downloadUrl);
    }
}