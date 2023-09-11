package Oop;
abstract class Appliance {
    protected String brand;
    protected double power;

    public Appliance(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    public abstract void operate();
}

class WashingMachine extends Appliance {
    public WashingMachine(String brand, double power) {
        super(brand, power);
    }

    @Override
    public void operate() {
        System.out.println("Washing machine by " + brand + " is washing.");
        System.out.println("Power consumption: " + power + " kW");
    }
}

class Refrigerator extends Appliance {
    public Refrigerator(String brand, double power) {
        super(brand, power);
    }

    @Override
    public void operate() {
        System.out.println("Refrigerator by " + brand + " is cooling.");
        System.out.println("Power consumption: " + power + " kW");
    }
}

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("Samsung", 1.5);
        washingMachine.operate();

        Refrigerator refrigerator = new Refrigerator("LG", 0.8);
        refrigerator.operate();
    }
}
