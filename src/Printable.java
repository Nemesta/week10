interface Printable {
    void print();
}
interface Taxable {
    double TAX_RATE = 0.12;
    double calculateTax();
}