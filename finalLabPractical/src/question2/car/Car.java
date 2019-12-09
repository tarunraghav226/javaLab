package question2.car;

public class Car implements  Comparable<Car>{
    private String manufacturer;
    private double price;

    public Car(String manufacturer, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Manufacturer "+this.manufacturer+" Price "+this.price;
    }

    @Override
    public int compareTo(Car car){
        return Double.compare(this.price,car.price);
    }
}
