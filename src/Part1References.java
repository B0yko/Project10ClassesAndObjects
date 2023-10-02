class Assignments {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Assignments(int number) {
        this.number = number;
    }
}

class Arguments {
    private int number;
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Arguments(int number) {
        this.number = number;
    }
}
public class Part1References {
    // Define a method that takes an object of Arguments as an argument
    public static void changeArgument(Arguments obj2, int newVariable) {
        // Change the object value
        obj2.setNumber(newVariable);
    }
    public static void main(String[] args) {
        // 1.1 Assignments
        Assignments obj1 = new Assignments(5);
        Assignments var1 = obj1;
        Assignments var2 = obj1;

        System.out.println("Value from variable 1: " + var1.getNumber());
        System.out.println("Value from variable 2: " + var2.getNumber());

        var1.setNumber(10);

        System.out.println("Value from variable 1 (changed): " + var1.getNumber());
        System.out.println("Value from variable 2 (changed): " + var2.getNumber());

        // 1.2 Arguments
        Arguments obj2 = new Arguments(70); // Creating an object of class Arguments
        System.out.println(obj2.getNumber()); // Print value of the object

        changeArgument(obj2, 200); // Call method with new value for the object
        System.out.println("Changed value of the object: " + obj2.getNumber());
        // Print changed value of the object
    }
}