package marco.hernandez.velazco.actividades.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import marco.hernandez.velazco.actividades.actividad1.model.Car;

public class StockManager {
    private final List<Car> cars;

    public StockManager() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }
}