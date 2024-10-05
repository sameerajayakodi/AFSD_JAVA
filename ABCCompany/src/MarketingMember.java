public class MarketingMember extends Member {
    private String name;
    private int yearOfExperience;
    private String address;
    private String gender;
    private double salary;

    public MarketingMember(String name, int yearOfExperience, String address, String gender, double salary) {
        this.name = name;
        this.yearOfExperience = yearOfExperience;
        this.address = address;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}