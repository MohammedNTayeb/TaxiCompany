package Departments;

public abstract class Department {
    //    protected String departmentName;
    protected String managerFirstName;
    protected String managerLastName;

    public Department(String managerFirstName, String managerLastName) {
//        this.departmentName = departmentName;
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
    }

//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }
}
