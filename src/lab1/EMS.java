package lab1;

public class EMS {
    public static void main(String[] args) {
        // Create a FullTimeEmployeeBuilder
        EmployeeBuilder fullTimeBuilder = new FullTimeEmployeeBuilder();
        
        // Use EmployeeDirector to manage the construction process for full time employee
        EmployeeDirector director = new EmployeeDirector(fullTimeBuilder);
        
        // Construct a full time employee with the director
        Employee fullTimeEmployee = director.constructEmployee(
            1, "John Doe", "IT", "Software Developer", 40, 100000
        );
        
        // Get the singleton instance of EmployeeManager and add the full time employee
        EmployeeManager manager = EmployeeManager.getInstance();
        manager.addEmployee(fullTimeEmployee);
        
        // Print information about the full time employee
        System.out.println("Full-time employee created: " + fullTimeEmployee.name + ", Department: " + fullTimeEmployee.department);

        // Create a PartTimeEmployeeBuilder
        EmployeeBuilder partTimeBuilder = new PartTimeEmployeeBuilder();
        
        // Use the same EmployeeDirector to construct a part-time employee
        director = new EmployeeDirector(partTimeBuilder);
        Employee partTimeEmployee = director.constructEmployee(
            2, "Jane Smith", "HR", "HR Coordinator", 20, 50000
        );
        
        // Add the part time employee to the manager
        manager.addEmployee(partTimeEmployee);
        
        // Print information about the part-time employee
        System.out.println("Part-time employee created: " + partTimeEmployee.name + ", Department: " + partTimeEmployee.department);

        // List all employees in the system
        System.out.println("\nAll employees in the system:");
        for (Employee employee : manager.getAllEmployees()) {
            System.out.println("Employee: " + employee.name + ", Role: " + employee.role);
        }
    }
}

