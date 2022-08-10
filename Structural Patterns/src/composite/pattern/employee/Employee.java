package composite.pattern.employee;

public abstract class Employee {
    
    private String name;
    private String role;
  



    public Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
      
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public abstract void showEmployeeDetails();
    public abstract float showEmployeeSalary();
    
}
