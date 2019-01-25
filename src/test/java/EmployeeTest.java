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
        employee = new Manager("Thomas McPhee", "THOMAS1", 50000, DepartmentType.HR);
        assertEquals("Thomas McPhee", employee.getName());
    }

    @Test
    public void developerAsEmployee(){
        employee = new Developer("Thomas McPhee", "THOMAS1", 50000);
        assertEquals("Thomas McPhee", employee.getName());
    }

    @Test
    public void databaseAdminAsEmployee(){
        employee = new DatabaseAdmin("Thomas McPhee", "THOMAS1", 50000);
        assertEquals("Thomas McPhee", employee.getName());
    }

}
