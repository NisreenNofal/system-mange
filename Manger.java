package SchoolManagementSystem;

public class Manger extends Employee {

    private double mangerBonus;

    Manger() {
        super();
        mangerBonus = 0;
    }

    Manger(String name, String id, String address, int phoneNumber, String email, int basicSalary, String password, int mangerBonus) {
        super(name, id, address, phoneNumber, email, basicSalary, password);
        this.mangerBonus = mangerBonus;
    }

    /**
     * @return the mangerBonus
     */
    public double getMangerBonus() {
        return mangerBonus;
    }

    /**
     * @param mangerBonus the mangerBonus to set
     */
    public void setMangerBonus(double mangerBonus) {
        this.mangerBonus = mangerBonus;
    }

    @Override
    public String toString() {
        return super.toString() + ",the manger bonus is " + mangerBonus;
    }

    @Override
    public double getSalary() {
        return getBasicSalary() + getLiveExpensive() + mangerBonus;
    }

}
