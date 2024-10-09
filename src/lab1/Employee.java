package lab1;

//defining an abstract class with employees attributes
public abstract class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected String role;
    protected int workingHoursPerWeek;
    protected double salary;

    // constructor to initialize all attributes of employee
    public Employee(int id, String name, String department, String role, int workingHoursPerWeek,double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.role = role;
        this.workingHoursPerWeek = workingHoursPerWeek;
        this.salary = salary;
        
    }

    // abstract methods to define employee behavior, to be implement by subclass
    public abstract void clockIn();
    public abstract void clockOut();
    public abstract void trackWorkHours();
}

/*
这个类定义了员工的一些共同属性和行为，但不提供具体实现，使用abstract表示这是一个抽象类，不能实例化
定义抽象类在OOP中是一个重要的设计选择，当需要定义一些基础行为供子类共享，但又不希望直接实例化该类时使用
抽象类允许代码复用，定义了子类共享的属性和方法，从而避免在每个子类中重复编写相同的代码
constructor在这里的作用是为这些属性提供初始值，虽然employee是一个抽象类无法直接实例化，但子类可以通过调用父类的构造函数来初始化这些共有属性
abstract methods提供了行为的框架，但具体的实现由子类来定义，这样有助于强制子类实现这些方法，确保所有类型的员工都有这些行为
*/