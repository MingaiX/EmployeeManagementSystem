package lab1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private static EmployeeManager instance;
    private List<Employee> employees;

    // 私有构造方法，防止外部实例化
    private EmployeeManager() {
        employees = new ArrayList<>();
    }

    // 单例获取方法
    public static synchronized EmployeeManager getInstance() {
        if (instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }

    // add employees
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // remove employees
    public void removeEmployee(int id) {
        employees.removeIf(e -> e.id == id);
    }

    // retrieve employees
    public Employee getEmployee(int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                return e;
            }
        }
        return null;
    }
}
