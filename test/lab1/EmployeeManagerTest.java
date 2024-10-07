package lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author minga
 */
public class EmployeeManagerTest {
    
    public EmployeeManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class EmployeeManager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EmployeeManager expResult = null;
        EmployeeManager result = EmployeeManager.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEmployee method, of class EmployeeManager.
     */
    @Test
    public void testAddEmployee() {
        System.out.println("addEmployee");
        Employee employee = null;
        EmployeeManager instance = null;
        instance.addEmployee(employee);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEmployee method, of class EmployeeManager.
     */
    @Test
    public void testRemoveEmployee() {
        System.out.println("removeEmployee");
        int id = 0;
        EmployeeManager instance = null;
        instance.removeEmployee(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeManager.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        int id = 0;
        EmployeeManager instance = null;
        Employee expResult = null;
        Employee result = instance.getEmployee(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
