public class Phone extends Product {

    private String color;

    public Phone(int ID, String brand, int price, String color) {
        super(ID, brand, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color;
    }
}
