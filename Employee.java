package SchoolManagementSystem;

public abstract class Employee {

    private String name;
    private String id;
    private String address;
    private int phoneNumber;
    private String email;
    private double basicSalary;
    private double liveExpensive = (10 / 100) * this.basicSalary;
    private String password;

    Employee() {
        name = null;
        id = null;
        address = null;
        phoneNumber = 0;
        email = null;
        basicSalary = 0;
        liveExpensive = 0;
        password = null;
    }

    Employee(String name, String id, String address, int phoneNumber, String email, int basicSalary, String password) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.basicSalary = basicSalary;
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the liveExpensive
     */
    public double getLiveExpensive() {
        return liveExpensive;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "The name is " + name + ",the id is " + id + ",the address is " + address + "\n,the phone number is " + phoneNumber
                + ",the email is " + email + ",the basic salary is " + basicSalary + "\n,a liveExpensive is " + liveExpensive
                + ",the Password is " + password;
    }

    public abstract double getSalary();
}
