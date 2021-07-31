import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static boolean exit = false;

    public static void main(String[] args) {

        switchMenu();
//
//        ArrayList products = new ArrayList();
//
//        Phone p1 = new Phone(1, "iPhone", 9000, "Black");
//        Computer c1 = new Computer(2, "mac", 20000, 20);
//         products.add(p1);
//         products.add(c1);
//        System.out.println(products);



    }
    private static void switchMenu() {

        while (!exit) {
            System.out.println("==Välj==");
            System.out.println("0. Avsluta");
            System.out.println("1. Lägg till produkt");
            System.out.println("2. Ta bort produkt");
            System.out.println("3. Visa alla");
            System.out.println("4. Visa alla telefoner");
            System.out.println("5. Visa alla datorer");
            System.out.println("6. Uppdatera pris");
            System.out.println("7. Uppdatera färg på mobil");
            System.out.println("8. Uppdatera skärmstorlek");
            System.out.println("9. Sök på ID");


            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 0:
                    exit = true;
                    System.out.println("Avslutar");
                    break;
                case 1:
                    addProduct();
                    break;
                case 2:
                    removeProduct();
                    break;
                case 3:
                    showAllProducts();
                    break;
                case 4:
                    printPhones();
                    break;
                case 5:
                    printComputers();
                    break;
                case 6:
                    setNewPrice();
                    break;
                case 7:
                    setNewColor();
                    break;
                case 8:
                    setNewScreenSize();
                    break;
                case 9:
                    search();
                    break;
            }
        }

    }

    private static void addProduct() {
        System.out.println("Vill du lägga till en telefon eller dator?");
        String val = sc.nextLine();
        if (val.equalsIgnoreCase("telefon")) {
            addPhone();
        }
        else if (val.equalsIgnoreCase("dator")) {
            addComp();
        }
        else {
            System.out.println("Försök igen");
            addProduct();
        }
    }
    private static void addPhone() {
        System.out.println("ID: ");
        int Id = sc.nextInt();
        sc.nextLine();

        System.out.println("Märke: ");
        String marke = sc.nextLine();

        System.out.println("Pris: ");
        int pris = sc.nextInt();
        sc.nextLine();

        System.out.println("Färg: ");
        String color = sc.nextLine();

        Product p = new Phone(Id, marke, pris, color);
        System.out.println("Tillagd telefon: " + p);

        ProductManagement.add(p);
    }

    private static void addComp() {
        System.out.println("ID: ");
        int Id = sc.nextInt();
        sc.nextLine();

        System.out.println("Märke: ");
        String marke = sc.nextLine();

        System.out.println("Pris: ");
        int pris = sc.nextInt();
        sc.nextLine();

        System.out.println("Skärmstorlek: ");
        int screen = sc.nextInt();
        sc.nextLine();

        Product c = new Computer(Id, marke, pris, screen);
        System.out.println("Tillagd dator: " + c);

        ProductManagement.add(c);
    }

    private static void removeProduct() {
        System.out.println("Skriv in ID på produkten du vill at bort: ");
        int idInput = sc.nextInt();
        sc.nextLine();

        ProductManagement.remove(idInput);
        System.out.println("Tar bort produkt med ID " + idInput);
    }
    private static void showAllProducts() {
        ProductManagement.showAll();
    }
    private static void printPhones() {
        ProductManagement.showAllPhones();
    }
    private static void printComputers() {
        ProductManagement.showAllComputers();
    }

    private static void setNewPrice() {
        System.out.println("Skriv in ID på produkten du vill ändra pris på: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Skriv in det nya priset på produkten: ");
        int newPrice = sc.nextInt();
        sc.nextLine();

        ProductManagement.updatePrice(id, newPrice);
        System.out.println("Det nya priset på vara " + id + " är " + newPrice + " kr");
    }

    private static void setNewColor() {
        System.out.println("Skriv in ID på telefonen du vill ändra färg på: ");
        int enterID = sc.nextInt();
        sc.nextLine();
        System.out.println("Skriv in den nya färgen: ");
        String newColor = sc.nextLine();

        ProductManagement.updateColor(enterID, newColor);
        System.out.println("Färgen på produkt " + enterID  + " är ändrad till " + newColor);
    }

    private static void setNewScreenSize() {
        System.out.println("Skriv in ID på produkten du vill ändra: ");
        int ID = sc.nextInt();
        sc.nextLine();
        System.out.println("Skriv in den nya skärmstorleken: ");
        int newScreenSize = sc.nextInt();
        sc.nextLine();

        ProductManagement.updateScreenSize(ID, newScreenSize);
        System.out.println("Produkten med ID " + ID + " är ändrad till skärmstorlek" + newScreenSize);
    }

    private static void search() {
        System.out.println("Skriv in ID: ");
        int searchedId = sc.nextInt();
        sc.nextLine();

        ProductManagement.searchById(searchedId);
    }

}
