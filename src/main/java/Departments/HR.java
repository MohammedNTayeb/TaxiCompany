package Departments;

import org.example.Employee;

import java.util.ArrayList;

public class HR extends Department {
    public static void addShowEmployee() {
        ArrayList<Employee> emplist = new ArrayList<>();
        Employee emp1 = new Employee(4, "Abc", "Xyz", 22,
                "Poland", "Warsaw", "Employee", 1900, "HR", 7);
        Employee emp2 = new Employee(5, "Abc", "Xyz", 27,
                "Poland", "Warsaw", "Employee", 2350, "HR", 7);
        Employee emp3 = new Employee(6, "Abc", "Xyz", 45,
                "Poland", "Warsaw", "Employee", 2900, "HR", 7);
        emplist.add(emp1);
        emplist.add(emp2);
        emplist.add(emp3);

        for (Employee emp : emplist) {
            System.out.println(emp);
        }
    }
}
