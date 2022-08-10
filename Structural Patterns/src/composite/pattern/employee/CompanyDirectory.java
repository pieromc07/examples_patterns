package composite.pattern.employee;

import java.util.ArrayList;

public class CompanyDirectory extends Employee {

    ArrayList<Employee> employees = new ArrayList<Employee>();

    public CompanyDirectory(String name, String role) {
        super(name, role);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }


    @Override
    public void showEmployeeDetails() {
        // TODO Auto-generated method stub

        for (Employee employee : employees) {
            employee.showEmployeeDetails();
        }

        System.out.println("Total Salary: " + showEmployeeSalary());
        
    }

    @Override
    public float showEmployeeSalary() {
        // TODO Auto-generated method stub
        float totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.showEmployeeSalary();
        }
        return totalSalary;
    }
    
}
