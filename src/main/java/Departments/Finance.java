package Departments;

public class Finance extends Department {
    private int employeeID;
    private String employeeFirstName;
    private String employeeLastName;
    private int age;
    private String country;
    private String city;
    private double salary;
    private int yearsOfExp;

    public Finance(int employeeID, String employeeFirstName, String employeeLastName, int age, String country, String city, double salary, int yearsOfExp, String managerfistName, String managerLastName) {
        super(managerfistName, managerLastName);
        this.employeeID = employeeID;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.age = age;
        this.country = country;
        this.city = city;
        this.salary = salary;
        this.yearsOfExp = yearsOfExp;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(int yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }
}
