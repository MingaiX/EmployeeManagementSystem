package lab1;

public class EmployeeDirector {
    private EmployeeBuilder builder;  // Reference to an EmployeeBuilder

    // Constructor to set the builder
    public EmployeeDirector(EmployeeBuilder builder) {
        this.builder = builder;  // Initialize with a specific builder (FullTimeEmployeeBuilder, PartTimeEmployeeBuilder)
    }

    // Method to construct an employee with predefined steps
    public Employee constructEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        return builder
            .setId(id)  // Set employee ID
            .setName(name)  // Set employee name
            .setDepartment(department)  // Set employee department
            .setRole(role)  // Set employee role
            .setWorkingHoursPerWeek(workingHoursPerWeek)  // Set working hours per week
            .setSalary(salary)  // Set employee salary
            .build();  // Build and return the final employee object
    }
}

/*
Director负责通过调用创造者提供的方法，来构建一个完整的员工对象，起到建造者模式(Builder Pattern)的指导者的角色
EmployeeDirector将会指导如何使用这些EmployeeBuilder（接口以及两个具体实现类）构建具体的Employee对象
通过引用EmployeeBuilder，可以调用里面的方法来设置员工对象的各个属性，这个builder可以是FullTimeEEmployeeBuilder或者是PartTime
构造函数EmployeeDirector(EmployeeBuilder builder)是为此类提供了一个初始化方法，通过这个构造函数，Director就知道应该使用哪个具体的Builder来构建员工对象
constructEmployee()方法负责组织和执行构建员工对象的步骤，依次调用builder中的方法来设置员工属性，并在最后生成最终员工

*/