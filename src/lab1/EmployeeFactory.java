package lab1;

public class EmployeeFactory {
    public static Employee createEmployee(String type, int id, String name, String department, String role, int hours, double salary) {
        if (type.equalsIgnoreCase("FullTime")) {
            return new FullTimeEmployee(id, name, department, role, hours, salary);  // Return a FullTimeEmployee object
        } else if (type.equalsIgnoreCase("PartTime")) {
            return new PartTimeEmployee(id, name, department, role, hours, salary);  // Return a PartTimeEmployee object
        }
        return null;  // Return null if the type is not recognized
    }
}

/*
工厂模式通过EmployeeFactory提供了根据类型动态创建不同员工对象的能力
createEmployee()方法根据传入的类型参数创建并返回相应的员工
*/