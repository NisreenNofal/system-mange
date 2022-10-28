package SchoolManagementSystem;

import java.util.ArrayList;

public class Subject {

    private String subjectName;
    private ArrayList<Student> student = new ArrayList<>();
    private ArrayList<Teacher> teacher = new ArrayList<>();

    Subject(String subjectName, ArrayList<Student> student, ArrayList<Teacher> teacher) {
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.student = student;
    }

    /**
     * @return the subjectName
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    /**
     * @return the student
     */
    public ArrayList<Student> getStudent() {
        return student;
    }

    /**
     * @param student the student to set
     */
    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    /**
     * @return the teacher
     */
    public ArrayList<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "The subject name is " + subjectName + ",the teachers are " + teacher.toString() + "the students are " + student.toString();
    }

}
