class Product implements Printable {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public void print() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}