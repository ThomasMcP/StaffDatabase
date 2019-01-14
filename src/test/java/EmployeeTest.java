import Staff.*;
import Staff.Management.Manager;
import Staff.TechStaff.DatabaseAdmin;
import Staff.TechStaff.Developer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Test
    public void managerAsEmployee(){
        employee = new Manager("Patrick Bateman", "BATEMAN1", 50000, DepartmentType.HR);
        assertEquals("Patrick Bateman", employee.getName());
    }

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Patrick Bateman", "BATEMAN1", 50000);
        assertEquals("Patrick Bateman", employee.getName());
    }

    @Test
    public void databaseAdminAsEmployee(){
        employee = new DatabaseAdmin("Patrick Bateman", "BATEMAN1", 50000);
        assertEquals("Patrick Bateman", employee.getName());
    }

}
