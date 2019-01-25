import Staff.DepartmentType;
import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Thomas McPhee", "THOMAS1", 50000, DepartmentType.HR);
    }

    @Test
    public void hasName(){
        assertEquals("Thomas McPhee", manager.getName());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Human Resources", manager.getDepartmentName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("THOMAS1", manager.getNINumber());
    }

    @Test
    public void hasSalaryValue(){
        assertEquals(50000, manager.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(50000, manager.getSalary(), 0.001);
        manager.raiseSalary(0.01);
        assertEquals(50500, manager.getSalary(), 0.001 );
    }

    @Test
    public void canRaiseSalaryWithNegativeNumber(){
        assertEquals(50000, manager.getSalary(), 0.001);
        manager.raiseSalary(-0.01);
        assertEquals(50500, manager.getSalary(), 0.001 );
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, manager.payBonus(), 0.001);
    }


}
