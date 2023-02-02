package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOListImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDAO carDAO = new CarDAOListImpl();

    @Override
    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);
    }
}
