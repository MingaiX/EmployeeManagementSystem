package lab1;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(int id, String name, String department, String role, int workingHoursPerWeek, double salary) {
        super(id, name, department, role, workingHoursPerWeek, salary);  // Call the superclass constructor to initialize properties
    }

    @Override
    public void clockIn() {
        System.out.println(name + " clocked in.");  // implement clock-in
    }

    @Override
    public void clockOut() {
        System.out.println(name + " clocked out.");  // implement clock-out
    }

    @Override
    public void trackWorkHours() {
        System.out.println(name + " is working part time.");  // implement work hours tracking for part time employee
    }
}


/*
继承自Employee类，具体实现了abstract methods
构造函数通过调用父类的构造函数来初始化所有员工属性
*/