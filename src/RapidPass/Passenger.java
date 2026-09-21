package RapidPass;

public class Passenger {
    private String  name;
    private String phone;
    private String email;
    private int age;
    private String institutionName;
    private int employeeId;

    public Passenger(String name, String phone, String email, int age, String institutionName, int employeeId){
        this.name=name;
        this.phone=phone;
        this.email=email;
        this.age=age;
        this.institutionName=institutionName;
        this.employeeId=employeeId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
