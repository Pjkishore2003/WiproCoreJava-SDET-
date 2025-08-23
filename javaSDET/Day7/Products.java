package pack7;

public class Products {
    double price;
    String name;

    public Products(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}
