package Part2ArtefactCollection;
import java.util.Scanner;
import java.util.Calendar;

class Drum {
    int year = Calendar.getInstance().get(Calendar.YEAR);
    private String manufacturer;
    private String model;
    private String producingCountry;
    private String type;
    private String material;
    private String color;
    private double price;
    private double radius;
    private int yearOfPurchase;

    // Constructor with initial values
    public Drum(String manufacturer, String model, String producingCountry, String type,
                String material, String color, double price, double radius, int yearOfPurchase) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.producingCountry = producingCountry;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.radius = radius;
        this.yearOfPurchase = yearOfPurchase;
    }

    // Getter and setter methods
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getProducingCountry() {
        return producingCountry;
    }
    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }
    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getAge(int yearOfPurchase) {
        return year - yearOfPurchase;
    }
}
class Collection {
    // Fields
    private int count;
    private Drum[] drums;

    // Getters & Setters
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Drum[] getArray() {
        return drums;
    }

    public void setArray(Drum[] drums) {
        this.drums = drums;
    }

    // Constructor
    public Collection(int capacity) {
        count = 0;
        drums = new Drum[capacity];
    }

    public void add(Drum newDrum) {
        if (count < drums.length) {
            drums[count] = newDrum;
            count++;
        } else {
            System.out.println("Collection is full. Cannot add more drums.");
        }
    }
    // Method to output the full description of the one drum
   public void printOne(int i) {
        if (i >= 0 && i < count) {
            System.out.println("Drum: " + (i+1) + ":");
            System.out.println("Manufacturer: " + drums[i].getManufacturer());
            System.out.println("Model: " + drums[i].getModel());
            System.out.println("Producing country: " + drums[i].getProducingCountry());
            System.out.println("Type: " + drums[i].getType());
            System.out.println("Material: " + drums[i].getMaterial());System.out.println("Color: " + drums[i].getColor());
            System.out.println("Price: $" + drums[i].getPrice());
            System.out.println("Radius: " + drums[i].getRadius() + "\"");
            System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
            System.out.println("Age: " + drums[i].getAge(2018));System.out.println();
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to output the full description of the drums
    public String print() {
        for (int i = 0; i < count; i++) {
            System.out.println("Drum: " + (i + 1) + ":");
            System.out.println("Manufacturer: " + drums[i].getManufacturer());
            System.out.println("Model: " + drums[i].getModel());
            System.out.println("Producing country: " + drums[i].getProducingCountry());
            System.out.println("Type: " + drums[i].getType());
            System.out.println("Material: " + drums[i].getMaterial());
            System.out.println("Color: " + drums[i].getColor());
            System.out.println("Price: $" + drums[i].getPrice());
            System.out.println("Radius: " + drums[i].getRadius() + "\"");
            System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
            System.out.println("Age: " + drums[i].getAge(2018));
            System.out.println();
        }
        return "";
    }

    public void findDrum(String s) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (drums[i].getType().equals(s)) {
                System.out.println("Found drum: ");
                System.out.println("Drum: " + (i + 1) + ":");
                System.out.println("Manufacturer: " + drums[i].getManufacturer());
                System.out.println("Model: " + drums[i].getModel());
                System.out.println("Producing country: " + drums[i].getProducingCountry());
                System.out.println("Type: " + drums[i].getType());
                System.out.println("Material: " + drums[i].getMaterial());
                System.out.println("Color: " + drums[i].getColor());
                System.out.println("Price: $" + drums[i].getPrice());
                System.out.println("Radius: " + drums[i].getRadius() + "\"");
                System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
                System.out.println("Age: " + drums[i].getAge(2018));
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching drums found.");
        }
    }
    public void findDrumByPrice(double n) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (drums[i].getPrice() == (n)) {
                System.out.println("Found drum: ");
                System.out.println("Drum: " + (i + 1) + ":");
                System.out.println("Manufacturer: " + drums[i].getManufacturer());
                System.out.println("Model: " + drums[i].getModel());
                System.out.println("Producing country: " + drums[i].getProducingCountry());
                System.out.println("Type: " + drums[i].getType());
                System.out.println("Material: " + drums[i].getMaterial());
                System.out.println("Color: " + drums[i].getColor());
                System.out.println("Price: $" + drums[i].getPrice());
                System.out.println("Radius: " + drums[i].getRadius() + "\"");
                System.out.println("Year of purchase: " + drums[i].getYearOfPurchase());
                System.out.println("Age: " + drums[i].getAge(2018));
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching drums found.");
        }
    }

    public void sortDrums() {
        boolean swapped;
        for (int i = 0; i < count - 1; i++) {
            swapped = false;
            for (int j = 0; j < count - i - 1; j++) {
                if (drums[j].getPrice() > drums[j + 1].getPrice()) {
                    swapped = true;
                    Drum temp = drums[j];
                    drums[j] = drums[j + 1];
                    drums[j + 1] = temp;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Collection collection = new Collection(5);

        System.out.println("Welcome to the drum collection!");

//        collection.add(new Drum("Pearl", "Roadshow", "Japan", "Snare Drum",
//                "Linden Wood", "Black", 90, 14, 2018));
//
//        collection.add(new Drum("Pearl", "Roadshow", "Japan", "Small Tom",
//                "Linden Wood", "Black", 75, 10, 2018));
//
//        collection.add(new Drum("Pearl", "Roadshow", "Japan", "Mid Tom",
//                "Linden Wood", "Black", 85, 12, 2018));
//
//        collection.add(new Drum("Pearl", "Roadshow", "Japan", "Big Tom",
//                "Linden Wood", "Black", 180, 18, 2018));
//
//        collection.add(new Drum("Pearl", "Roadshow", "Japan", "Bass Drum",
//                "Linden Wood", "Black", 300, 20, 2018));
//
//        System.out.println("Printing all drums in the collection:");
//        collection.print();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add drum to collection");
            System.out.println("2. Print all drums");
            System.out.println("3. Print one drum");
            System.out.println("4. Sort drums by price");
            System.out.println("5. Search in drums by type");
            System.out.println("6. Search in drums by price");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int number = in.nextInt();
            in.nextLine();
            switch (number) {
                case 1:
                    inputDrum(collection, in);
                    break;
                case 2:
                    printAllDrums(collection);
                    break;
                case 3:
                    printOne(collection, in);
                    break;
                case 4:
                    sortByPrice(collection, in);
                    break;
                case 5:
                    searchByType(collection, in);
                    break;
                case 6:
                    searchByPrice(collection, in);
                    break;
                case 7:
                    System.out.println("Thanks for using our program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again");
            }
        }
    }

    public static void inputDrum(Collection collection, Scanner in) {
        System.out.println("Enter drum properties: ");

        System.out.println("Manufacturer: ");
        String manufacturer = in.nextLine();

        System.out.println("Model: ");
        String model = in.nextLine();

        System.out.println("Producing country: ");
        String producingCountry = in.nextLine();

        System.out.println("Type: ");
        String type = in.nextLine();

        System.out.println("Material: ");
        String material = in.nextLine();

        System.out.println("Color: ");
        String color = in.nextLine();

        System.out.println("Price: ");
        double price = in.nextDouble();

        System.out.println("Radius: ");
        double radius = in.nextDouble();

        System.out.println("Year of purchase: ");
        int yearOfPurchase = in.nextInt();

        collection.add(new Drum(manufacturer, model, producingCountry,
                type, material, color, price, radius, yearOfPurchase));
        System.out.println("Drum added to the collection");
    }
    public static void printAllDrums(Collection collection) {
        System.out.println("Printing all drums in collection: ");
        collection.print();
    }
    public static void printOne(Collection collection, Scanner in) {
        System.out.println("Enter a number of the drum: ");
        int i = in.nextInt();
        collection.printOne(i-1);
    }
    public static void sortByPrice(Collection collection, Scanner in) {
        System.out.println("Sorting drums by price...");
        collection.sortDrums();
        System.out.println("Sorted!");
    }
    public static void searchByType(Collection collection, Scanner in) {
        System.out.println("Enter the type of the drum: ");
        String type = in.nextLine();
        collection.findDrum(type);
    }
    public static void searchByPrice(Collection collection, Scanner in) {
        System.out.println("Enter the price of the drum: ");
        double price = in.nextDouble();
        collection.findDrumByPrice(price);
    }
}
