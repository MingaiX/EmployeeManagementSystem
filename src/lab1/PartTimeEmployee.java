package lab1;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, String department, String role) {
        super(id, name, department, role);
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as part-time employee.");
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out.");
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " is tracking work hours.");
    }
}