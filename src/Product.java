public class Product {

    protected String ID;
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
    }

    public Product(String ID, String name, double price, int quantity) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    @Override
    public String toString() {
        return "product [ID=" + ID + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
