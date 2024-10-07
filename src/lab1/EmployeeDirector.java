package lab1;

public class EmployeeDirector {
    public Employee constructEmployee(EmployeeBuilder builder) {
        return builder.setName("John Doe")
                      .setDepartment("Engineering")
                      .setRole("Developer")
                      .build();
    }
}
