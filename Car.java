package Classes;

public class Car {
    private String model;
    private int year;
    private int doors;
    private double price;
    private boolean hasFuel;

    public Car(String model, int year, int doors, int price) {
        this.model = model;
        this.year = year;
        this.doors = doors;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void start() {
        if (hasFuel) {
            System.out.println(model + " 's engine turned on !!!");
        }
    }

    public void stop() {
        System.out.println(model + " 's engine turned off !!!");
    }

    public void turnLeft() {
        System.out.println(model + " turned left !!!");
    }

    public void turnRight() {
        System.out.println(model + " turned right !!!");
    }
}
