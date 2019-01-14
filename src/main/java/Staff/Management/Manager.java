package Staff.Management;

import Staff.DepartmentType;
import Staff.Employee;

public class Manager extends Employee {
    private DepartmentType deptName;

    public Manager(String name, String NINumber, double salary, DepartmentType deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDepartmentName() {
        return this.deptName.getDepartmentName();
    }


}
