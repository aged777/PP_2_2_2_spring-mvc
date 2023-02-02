package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOListImpl implements CarDAO {
    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "Ferrari", "Black", 10));
        cars.add(new Car(++CAR_COUNT, "Lambo", "Yellow", 20));
        cars.add(new Car(++CAR_COUNT, "Porcshe", "White", 30));
        cars.add(new Car(++CAR_COUNT, "BMW", "Red", 40));
        cars.add(new Car(++CAR_COUNT, "Lada", "Brown", 50));
    }

    public List<Car> getCars(Integer count){
        ArrayList<Car> someCars = new ArrayList<>();
        if(count >= 5) return  cars;
        for(int i = 0; i < count; i++) {
            someCars.add(cars.get(i));
        }
        return someCars;
    }
}
