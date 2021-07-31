public class Product {

    private int ID;
    private String brand;
    private int price;

    public Product(int ID, String brand, int price) {
        this.ID = ID;
        this.brand = brand;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + ID + "\nBrand: " + brand + "\nPrice: " + price + " kr";
    }
}
