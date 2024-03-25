package za.ac.cput.factory;

import za.ac.cput.domain.Car;
import za.ac.cput.domain.Fleet;

import java.util.List;

public class FleetFactory {

    public static Fleet createFleet(List<Car> cars) {
        Fleet fleet = new Fleet();

        if (cars != null) {
            for (Car car : cars) {
                fleet.addCar(car);
            }
        }

        return fleet;
    }
}

