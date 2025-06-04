package rodrigoservicecenter.model.entity;

import java.sql.Date;

public class Employee {
    private int employeeId;
    private int nic;
    private String name;
    private String roleName;
    private int phone;
    private String email;
    private String address;
    private Date dateOfJoining;
    private Date dateOfBirth;
    private String workOutlet;
    private Department department;

    public Employee(String roleName, String address, Date dateOfBirth, Date dateOfJoining, Department department, String email, int employeeId, String name, int nic, int phone, String workOutlet) {
        this.roleName = roleName;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.department = department;
        this.email = email;
        this.employeeId = employeeId;
        this.name = name;
        this.nic = nic;
        this.phone = phone;
        this.workOutlet = workOutlet;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWorkOutlet() {
        return workOutlet;
    }

    public void setWorkOutlet(String workOutlet) {
        this.workOutlet = workOutlet;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
