package Oop;
public class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void start() {
        System.out.println("The " + year + " " + brand + " " + model + " is starting.");
    }

    public void accelerate(int amount) {
        speed += amount;
        System.out.println("The " + year + " " + brand + " " + model + " is accelerating. Current speed: " + speed + " mph.");
    }

    public void brake(int amount) {
        if (speed - amount >= 0) {
            speed -= amount;
        } else {
            speed = 0;
        }
        System.out.println("The " + year + " " + brand + " " + model + " is braking. Current speed: " + speed + " mph.");
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Tesla", "Model S", 2023);
        Car car3 = new Car("Ford", "Mustang", 2021);

        car1.start();
        car1.accelerate(20);
        car1.brake(5);

        car2.start();
        car2.accelerate(30);
        car2.brake(10);

        car3.start();
        car3.accelerate(25);
        car3.brake(15);
    }
}

