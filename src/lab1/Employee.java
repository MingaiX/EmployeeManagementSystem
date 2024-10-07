package lab1;

//defining an abstract class with employees attributes
public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    // constructor 
    public Employee(int id, String name, String department, String role) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
    }

    // abstract methods
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();
}

