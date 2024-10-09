/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author minga
 */
public class EmployeeFactoryIT {
    
    public EmployeeFactoryIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createEmployee method, of class EmployeeFactory.
     */
    @Test
    public void testCreateEmployee() {
        System.out.println("createEmployee");
        String type = "";
        int id = 0;
        String name = "";
        String department = "";
        String role = "";
        int hours = 0;
        double salary = 0.0;
        Employee expResult = null;
        Employee result = EmployeeFactory.createEmployee(type, id, name, department, role, hours, salary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
