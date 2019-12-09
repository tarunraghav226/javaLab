package question2;

import question2.car.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arrayList =new ArrayList<>();

        Car car =new Car("Manufacturer 1",43563.324);
        arrayList.add(car);

        car =new Car("Manufacturer 2",897987.34);
        arrayList.add(car);

        car =new Car("Manufacturer 3",345353234.23);
        arrayList.add(car);

        for(Car cara:arrayList)
            System.out.println(cara);
    }
}
