package lab1;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagerTest {

    private EmployeeManager manager;

    // Before each test, reset the EmployeeManager instance
    @Before
    public void setUp() throws Exception {
        // Reset the singleton instance to ensure tests are independent
        resetSingleton();
        // Get a fresh instance of EmployeeManager for each test
        manager = EmployeeManager.getInstance();
    }

    // Use reflection to reset the singleton for testing purposes
    private void resetSingleton() throws Exception {
        java.lang.reflect.Field instance = EmployeeManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);  // Reset the instance to null
    }

    // Test to verify that EmployeeManager is a singleton
    @Test
    public void testGetInstance() {
        EmployeeManager manager1 = EmployeeManager.getInstance();
        EmployeeManager manager2 = EmployeeManager.getInstance();
        assertSame("EmployeeManager instances should be the same (Singleton)", manager1, manager2);
    }

    // Test adding an employee to EmployeeManager
    @Test
    public void testAddEmployee() {
        Employee employee = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 100000);
        manager.addEmployee(employee);
        assertEquals(1, manager.getAllEmployees().size());
        assertEquals(employee, manager.getEmployee(1));  // Compare the actual Employee object
    }

    // Test removing an employee from EmployeeManager
    @Test
    public void testRemoveEmployee() {
        Employee employee = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 100000);
        manager.addEmployee(employee);
        assertEquals(1, manager.getAllEmployees().size());
        manager.removeEmployee(employee);
        assertEquals(0, manager.getAllEmployees().size());
    }

    // Test retrieving an employee by their ID
    @Test
    public void testGetEmployee() {
        Employee employee = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 100000);
        manager.addEmployee(employee);
        Employee foundEmployee = manager.getEmployee(1);
        assertNotNull(foundEmployee);
        assertEquals(employee, foundEmployee);  // Compare the entire Employee object
    }

    // Test getting all employees in EmployeeManager
    @Test
    public void testGetAllEmployees() {
        Employee employee1 = new FullTimeEmployee(1, "John Doe", "IT", "Developer", 40, 100000);
        Employee employee2 = new FullTimeEmployee(2, "Jane Smith", "HR", "Coordinator", 20, 50000);
        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        assertEquals(2, manager.getAllEmployees().size());
    }
}
