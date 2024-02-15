package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    
    private CarDao carDao;
    
    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }
    
    @Override
    public List<Car> getCarsList(int carsQuantity) {
        return carDao.getCarsList(carsQuantity);
    }
}