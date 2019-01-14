import Staff.DepartmentType;
import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;

    @Before
    public void before(){
        director = new Director("Bruce Wayne", "IAMNOTBATMAN1", 100000, DepartmentType.DIRECTORS, 5000000);
    }

    @Test
    public void hasBudget(){
        assertEquals(5000000, director.getBudget(),0.001);
    }

    @Test
    public void canPayDoubleBonus(){
        assertEquals(2000, director.payBonus(), 0.001);
    }
}
