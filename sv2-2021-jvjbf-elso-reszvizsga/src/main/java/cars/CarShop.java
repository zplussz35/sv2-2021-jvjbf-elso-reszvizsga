package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> cars;

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
        this.cars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }

    public boolean addCar(Car car){
        if(car.getPrice()<=maxPrice){
            cars.add(car);
            return true;
        }
        else{
            return false;
        }
    }

    public int sumCarPrice(){
        int szum=0;
        for (Car car: cars) {
            szum+=car.getPrice();
        }
        return szum;
    }

    public int numberOfCarsCheaperThan(int price){
        int count=0;
        for (Car car:cars) {
            if(car.getPrice()<=price){
                count++;
            }
        }
        return count;
    }

    public List<Car> carsWithBrand(String brand){
        List<Car> carsWithBrand= new ArrayList<>();
        for (Car car: cars) {
            if(car.getBrand().equals(brand)){
                carsWithBrand.add(car);
            }
        }
        return carsWithBrand;
    }
}
