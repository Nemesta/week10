public class StoreDemo {
    public static void main(String[] args) {
        Printable[] items = new Printable[3];
        items[0] = new Product("P", 5);
        items[1] = new TaxableProduct("T", 55);
        items[2] = new DigitalProduct("D", 555, "www.download.com");
        double totalTax = 0;
        for (Printable item : items) {
            item.print();
            System.out.println("-----");
            if (item instanceof Taxable) {
                Taxable t = (Taxable) item;
                totalTax += t.calculateTax();
            }
        }
        System.out.println("Total Tax Collected: " + totalTax);
    }
}