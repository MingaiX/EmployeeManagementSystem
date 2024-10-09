package lab1;

public interface EmployeeBuilder {
    EmployeeBuilder setId(int id); 
    EmployeeBuilder setName(String name);
    EmployeeBuilder setDepartment(String department); 
    EmployeeBuilder setRole(String role); 
    EmployeeBuilder setWorkingHoursPerWeek(int hours); 
    EmployeeBuilder setSalary(double salary); 
    Employee build();  // Method to build and return the final employee object
}

/*
接口定义了一系列方法，帮助构建一个Employee对象，每个方法设置员工的不同属性，并返回EmployeeBuilder实现调用
Build()方法是建造者模式的核心，用于最终生成Employee对象。
接口是用来让不同的类实现相同的行为，而不关心具体的类如何实现这些行为。即只定义了应该做什么，但不定义如何做。
一个类可以实现多个接口，从而实现多重继承，即实现多个契约(规则）
构造函数是类的一部分，目的是初始化对象的状态，构造函数会在对象被创建时调用，用来为对象的属性赋初始值
*/