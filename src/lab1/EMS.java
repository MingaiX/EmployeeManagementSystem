package lab1;

public class EMS {
    public static void main(String[] args) {
        // 获取单例的 EmployeeManager 实例
        EmployeeManager manager = EmployeeManager.getInstance();
        
        // 创建工厂类实例
        EmployeeFactory factory = new EmployeeFactory();
        
        // 使用工厂模式创建全职和兼职员工
        Employee fullTimeEmployee = factory.createEmployee("fulltime");
        Employee partTimeEmployee = factory.createEmployee("parttime");
        
        // 将员工添加到 EmployeeManager 中
        manager.addEmployee(fullTimeEmployee);
        manager.addEmployee(partTimeEmployee);
        
        // 模拟员工操作
        fullTimeEmployee.clockIn();
        partTimeEmployee.clockIn();
        
        // 从管理器中检索员工
        Employee retrievedEmployee = manager.getEmployee(fullTimeEmployee.id);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved Employee: " + retrievedEmployee.name);
        }
    }
}
