package question2;

import question2.car.Car;

import java.util.ArrayList;
import java.util.Collections

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> arrayList =new ArrayList<>();

        Car car =new Car("Manufacturer 1",43563767676767.324);
        arrayList.add(car);

        car =new Car("Manufacturer 2",87987.34);
        arrayList.add(car);

        car =new Car("Manufacturer 3",234.23);
        arrayList.add(car);
        Collections.sort(arrayList);
        for(Car cara:arrayList)
            System.out.println(cara);
    }
}
