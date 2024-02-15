package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;
import java.util.Collections;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> carList = List.of(
            new Car ("brand1", "model1", "series1"),
            new Car ("brand2", "model2", "series2"),
            new Car ("brand3", "model3", "series3"),
            new Car ("brand4", "model4", "series4"),
            new Car ("brand5", "model5", "series5"));
    
    public CarDaoImpl() {}
    
    @Override
    public List<Car> getCarsList(int carsQuantity) {
        if (carsQuantity < 0) {
            return Collections.emptyList();
        }
        if ((0 <= carsQuantity) & (carsQuantity <= 5)) {
            return carList.subList(0, carsQuantity);
        } else {
            return carList;
        }
    }
}