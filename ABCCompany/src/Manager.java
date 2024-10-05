public class Manager extends Member{
    private String name;
    private String company;
    private double salary;
    private double gpa;
    private String email;

    public Manager(String name, String company, double salary, double gpa, String email) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.gpa = gpa;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
