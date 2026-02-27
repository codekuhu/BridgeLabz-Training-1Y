class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee("Honey", 101, 50000);
        emp.displayDetails();
    }
}
