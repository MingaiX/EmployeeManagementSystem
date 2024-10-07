package lab1;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, String department, String role) {
        super(id, name, department, role);
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in as full-time employee.");
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
