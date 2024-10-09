/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lab1;

import java.util.List;
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
public class EmployeeManagerTest {
    
    public EmployeeManagerTest() {
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
        Employee employee = null;
        EmployeeManager instance = null;
        instance.removeEmployee(employee);
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

    /**
     * Test of getAllEmployees method, of class EmployeeManager.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        EmployeeManager instance = null;
        List<Employee> expResult = null;
        List<Employee> result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
