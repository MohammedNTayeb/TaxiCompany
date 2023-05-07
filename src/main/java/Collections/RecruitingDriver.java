package Collections;

import Departments.Finance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Driver;

import java.util.ArrayList;
import java.util.Collection;

public class RecruitingDriver {

    private static final Logger LOGGER = LogManager.getLogger(RecruitingDriver.class);

    public static void recruitDriver() {
        Collection<Driver> recruiteDriver = new ArrayList<>();
        Driver driver1 = new Driver(1, "Mark", "Jones", 26, "Poland", "Warsaw", "Driver");
        Driver driver2 = new Driver(2, "George", "David", 35, "Poland", "Warsaw", "Driver");
        recruiteDriver.add(driver1);
        recruiteDriver.add(driver2);

        for (Driver driver : recruiteDriver) {
            LOGGER.info(driver);
        }
    }
}
