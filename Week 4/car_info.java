class Car {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, double price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void delivery(int count) {
        quantity += count;
    }

    public void sell(int count) {
        if (quantity >= count) {
            quantity -= count;
        } else {
            System.out.println("Not enough cars in stock.");
        }
    }

    @Override
    public String toString() {
        return "Car [Model=" + model + ", Brand=" + brand + ", Year=" + year + ", Price=" + price +
                ", Color=" + color + ", Quantity=" + quantity + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Model S", "Tesla", 2022, 75000, "Red", 10);
        System.out.println(car);

        car.sell(3);
        System.out.println("After selling 3 cars: " + car);

        car.setColor("Blue");
        car.setPrice(72000);
        System.out.println("After modifying color and price: " + car);
    }
}
