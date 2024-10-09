package lab1;

import java.util.ArrayList;
import java.util.List;

//Singleton Pattern
public class EmployeeManager {
    private static EmployeeManager instance;  // Static variable to hold the single instance
    private List<Employee> employees = new ArrayList<>();  // List to manage all emplyees

    // Private constructor to prevent external instantiation
    private EmployeeManager() {}

    // Static method to get the single instance of EmployeeManager
    public static EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();  // create the instance if it's null
        }
        return instance;  // Return the single instance
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Method to get an emloyee by ID
    public Employee getEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null; // Return null if no employee is found
    }

    // Method to get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }
}

/*
单例模式的主要目的是确保在整个应用程序中只有一个EmployeeManager实例，为了实现这一点：
1.构造函数被私有化
2.通过静态方法static getInstance()来返回唯一实例
3.静态变量instance保存这个唯一的实例，只有在第一次请求时才会创建（延迟加载）
*/