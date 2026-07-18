public class Book extends Product {
    private String tacGia;
    private String theLoai;
    private String NXB;
    private int soTrang;

    public Book() {
    }

    public Book(String ID, String name, double price, int quantity) {
        super(ID, name, price, quantity);
    }

    public Book(String ID, String name, double price, int quantity, String tacGia, int soTrang) {
        super(ID, name, price, quantity);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public String getNXB() {
        return NXB;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void display() {
        System.out.println("ID: " + ID + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    @Override
    public String toString() {
        return "Book [ID=" + getID() + ", name=" + getName() + ", price=" + getPrice() + ", quantity="
                + getQuantity() + ", tacGia=" + tacGia + ", soTrang=" + soTrang + "]";
    }

}
