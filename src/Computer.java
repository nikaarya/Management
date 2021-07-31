public class Computer extends Product{

    private int screenSize;

    public Computer(int ID, String brand, int price, int screenSize) {
        super(ID, brand, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nScreen Size: " + screenSize;
    }
}
