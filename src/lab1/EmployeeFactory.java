package lab1;

public class EmployeeFactory {
    public Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("fulltime")) {
            return new FullTimeEmployee(1, "Alice", "Sales", "Manager");
        } else if (type.equalsIgnoreCase("parttime")) {
            return new PartTimeEmployee(2, "Bob", "Marketing", "Assistant");
        }
        return null;
    }
}