public class Stationary extends Product {
    private String chatLieu;
    private String mau;
    private String nsx;

    public Stationary() {
    }

    public Stationary(String ID, String name, double price, int quantity, String chatLieu, String mau, String nsx) {
        super(ID, name, price, quantity);
        this.chatLieu = chatLieu;
        this.mau = mau;
        this.nsx = nsx;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    @Override
    public String toString() {
        return "Stationary [ID=" + getID() + ", name=" + getName() + ", price=" + getPrice() + ", quantity="
                + getQuantity() + ", chatLieu=" + chatLieu + ", mau=" + mau + ", nsx=" + nsx + "]";
    }

}
