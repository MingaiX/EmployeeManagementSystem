package lab1;


public class FullTimeEmployeeBuilder implements EmployeeBuilder {
    private Employee employee;

    public FullTimeEmployeeBuilder() {
        employee = new FullTimeEmployee(0, "", "", "");
    }

    @Override
    public EmployeeBuilder setName(String name) {
        employee.name = name;
        return this;
    }

    @Override
    public EmployeeBuilder setDepartment(String department) {
        employee.department = department;
        return this;
    }

    @Override
    public EmployeeBuilder setRole(String role) {
        employee.role = role;
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}

