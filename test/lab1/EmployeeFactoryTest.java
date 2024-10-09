package lab1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    // Test the creation of a FullTimeEmployee
    @Test
    public void testCreateFullTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("FullTime", 1, "John Doe", "IT", "Developer", 40, 100000);
        assertNotNull(employee);  // Ensure the employee is not null
        assertTrue(employee instanceof FullTimeEmployee);  // Verify that the object is of type FullTimeEmployee
        assertEquals(1, employee.id);  // Verify the ID is correct by directly accessing the 'id' field
        assertEquals("John Doe", employee.name); 
        assertEquals(40, employee.workingHoursPerWeek); 
        assertEquals(100000, employee.salary, 0.01); 
    }

    // Test the creation of a PartTimeEmployee
    @Test
    public void testCreatePartTimeEmployee() {
        Employee employee = EmployeeFactory.createEmployee("PartTime", 2, "Jane Smith", "HR", "Coordinator", 20, 50000);
        assertNotNull(employee);
        assertTrue(employee instanceof PartTimeEmployee); 
        assertEquals(2, employee.id);  
        assertEquals("Jane Smith", employee.name); 
        assertEquals(20, employee.workingHoursPerWeek);  
        assertEquals(50000, employee.salary, 0.01);  
    }

    // Test the behavior when an unknown employee type is passed
    @Test
    public void testUnknownEmployeeType() {
        Employee employee = EmployeeFactory.createEmployee("Intern", 3, "Mike Johnson", "Finance", "Intern", 30, 30000);
        assertNull(employee);  // The factory should return null for unknown types
    }
}

/*
测试是否可以用factory创建不同种类的employees，以及如果创建了一个不存在的type
*/