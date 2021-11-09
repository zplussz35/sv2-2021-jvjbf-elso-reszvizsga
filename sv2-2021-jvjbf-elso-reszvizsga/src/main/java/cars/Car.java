package cars;

import java.awt.*;

public class Car {
    private String brand;
    private double engineSize;
    private Color color;
    private int price;

    public Car(String brand, double engineSize,Color color, int price) {
        this.brand = brand;
        this.color = color;
        this.engineSize = engineSize;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent){
        price= (int)(price*((100-percent)/100.0));
    }
}
