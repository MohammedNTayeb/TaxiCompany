package Departments;
import org.example.Employee;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Finance extends Department {

   private static final Logger LOGGER = LogManager.getLogger(Finance.class);

    public static void addShowEmployee() {
        ArrayList<Employee> emplist = new ArrayList<>();
        Employee emp1 = new Employee(1, "James", "Adam", 35,
                "Poland", "Warsaw", "Employee", 2000, "Finance", 7);
        Employee emp2 = new Employee(2, "Steve", "David", 25,
                "Poland", "Warsaw", "Employee", 2100, "Finance", 7);
        Employee emp3 = new Employee(3, "Anna", "Williams", 34,
                "Poland", "Warsaw", "Employee", 2400, "Finance", 7);
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);

        for (Employee emp : emplist) {
           LOGGER.info(emp);
        }
    }
}

