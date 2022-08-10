package composite.pattern.employee;

public class Manager extends Employee{

    private String department;
    private float salary;

    public Manager(String name, String role, String department, float salary) {
        super(name, role);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }


    @Override
    public void showEmployeeDetails() {
        // TODO Auto-generated method stub
        System.out.println("Manager Details");
        System.out.println("#######################");
        System.out.println("Name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + showEmployeeSalary());
        System.out.println("Department: " + getDepartment());  
        System.out.println("\n\n");
    }

    @Override
    public float showEmployeeSalary() {
        // TODO Auto-generated method stub
        return getSalary();
    }




    
}
