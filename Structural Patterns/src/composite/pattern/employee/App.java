package composite.pattern.employee;
public class App {
    public static void main(String[] args) throws Exception {
        CompanyDirectory companyDirectory = new CompanyDirectory("Company Directory", "CEO");
        Manager manager = new Manager("John", "Manager", "IT", 100000);
        Developer developer = new Developer("John", "Developer", "Java", "Spring", 1000, 10);
        companyDirectory.addEmployee(manager);
        companyDirectory.addEmployee(developer);
        companyDirectory.showEmployeeDetails();
    }
}
