import java.util.ArrayList;

public class ProductManagement {

    private static ArrayList<Product> listOfProducts = new ArrayList();


    public static void add(Product p) {
        listOfProducts.add(p);
    }

    public static void remove(int prodId) {
        for (int i = listOfProducts.size() - 1; i >= 0; i--) {
            if (listOfProducts.get(i).getID() == prodId) {
                listOfProducts.remove(i);
            }
        }
    }

    public static void showAll() {
        System.out.println("Alla Produkter: ");
        for (Product p : listOfProducts) {
            System.out.println(p);
        }
    }

    public static void showAllPhones() {
        for (Product p : listOfProducts) {
            if (p instanceof Phone) {
                System.out.println(p);

            }

        }
    }
    public static void showAllComputers() {
        for (Product p: listOfProducts) {
            if (p instanceof Computer) {
                System.out.println(p);
            }
        }
    }
    public static void updatePrice(int prodId, int price) {
        for (Product p: listOfProducts) {
            if (p.getID() == prodId) {
                p.setPrice(price);
            }

        }
    }

    public static void updateColor(int productId, String color) {
        for (Product ph: listOfProducts) {
            if (ph.getID() == productId) {
                if (ph instanceof Phone) {
                    ((Phone) ph).setColor(color);
                }
            }
        }
    }








    public static void updateScreenSize(int prodId, int screenSizeComp) {
        for (Product p : listOfProducts) {
            if (p.getID() == prodId) {
                if (p instanceof Computer) {
                    ((Computer) p).setScreenSize(screenSizeComp);
                }
            }
        }
    }

    public static void searchById(int id) {
        for (Product p: listOfProducts) {
            if (p.getID() == id) {
                System.out.println(p);
            }
        }
    }

}
