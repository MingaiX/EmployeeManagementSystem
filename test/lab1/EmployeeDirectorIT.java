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
public class EmployeeDirectorIT {
    
    public EmployeeDirectorIT() {
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
     * Test of constructEmployee method, of class EmployeeDirector.
     */
    @Test
    public void testConstructEmployee() {
        System.out.println("constructEmployee");
        int id = 0;
        String name = "";
        String department = "";
        String role = "";
        int workingHoursPerWeek = 0;
        double salary = 0.0;
        EmployeeDirector instance = null;
        Employee expResult = null;
        Employee result = instance.constructEmployee(id, name, department, role, workingHoursPerWeek, salary);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
