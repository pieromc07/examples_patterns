package composite.pattern.employee;

public class Developer extends Employee {

    
    private String language;
    private String framework;
    private int hourlyRate;
    private int workingHours;

    public Developer(String name, String role) {
        super(name, role);
        //TODO Auto-generated constructor stub
    }

    public Developer(String name, String role, String language, String framework, int hourlyRate, int workingHours) {
        super(name, role);
        this.language = language;
        this.framework = framework;
        this.hourlyRate = hourlyRate;
        this.workingHours = workingHours;
    }

    public String getLanguage() {
        return language;
    }

    public String getFramework() {
        return framework;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getWorkingHours() {
        return workingHours;
    }


    @Override
    public void showEmployeeDetails() {
        // TODO Auto-generated method stub
        System.out.println("Developer Details");
        System.out.println("#######################");
        System.out.println("Name: " + getName());
        System.out.println("Role: " + getRole());
        System.out.println("Salary: " + showEmployeeSalary());
        System.out.println("Language: " + getLanguage());
        System.out.println("Framework: " + getFramework());
        System.out.println("Hourly Rate: " + getHourlyRate());
        System.out.println("\n\n");
    }

    @Override
    public float showEmployeeSalary() {
        // TODO Auto-generated method stub
        return getHourlyRate() * getWorkingHours();
    }

  
}
