package Staff.Management;

import Staff.DepartmentType;
import Staff.Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NINumber, double salary, DepartmentType deptName, double budget){
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    @Override
    public double payBonus() {
        return super.payBonus()*2;
    }
}
