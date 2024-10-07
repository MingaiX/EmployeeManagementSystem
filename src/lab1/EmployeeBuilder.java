package lab1;

public interface EmployeeBuilder {
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department);
    EmployeeBuilder setRole(String role);
    Employee build();
}
