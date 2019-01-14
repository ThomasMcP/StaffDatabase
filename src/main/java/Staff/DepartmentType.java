package Staff;

public enum DepartmentType {

    DEVOPS("Development Operations"),
    HR("Human Resources"),
    DIRECTORS("Directors");

    private String departmentName;

    DepartmentType(String departmentName){
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
