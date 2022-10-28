package SchoolManagementSystem;

public class Teacher extends Employee {

    private int classCount; // number of classes he teache
    private final int teacherBonus = 20;

    Teacher() {
        super();
        this.classCount = 0;
    }

    Teacher(int classCount, String name, String id, String address, int phoneNumber, String email, int basicSalary,  String password) {
        super(name, id, address, phoneNumber, email, basicSalary, password);
        this.classCount = classCount;
    }

    /**
     * @return the classCount
     */
    public int getClassCount() {
        return classCount;
    }

    /**
     * @param classCount the classCount to set
     */
    public void setClassCount(int classCount) {
        this.classCount = classCount;
    }

    @Override
    public String toString() {
        return super.toString() + ",the number of classes he teache  is " + classCount;
    }

    @Override
    public double getSalary() {
        return getBasicSalary() + getLiveExpensive() + (classCount * teacherBonus);
    }
}
