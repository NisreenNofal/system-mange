/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolManagementSystem;

/**
 *
 * @author LENOVO
 */
public class Student {

    private String studentId;
    private String studentName;
    private int studentLevel;

    Student() {
        this.studentId = null;
        this.studentLevel = 0;
        this.studentName = null;
    }

    Student(String studentId, String studentName, int studentLevel) {
        this.studentId = studentId;
        this.studentLevel = studentLevel;
        this.studentName = studentName;

    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the studentLevel
     */
    public int getStudentLevel() {
        return studentLevel;
    }

    /**
     * @param studentLevel the studentLevel to set
     */
    public void setStudentLevel(int studentLevel) {
        this.studentLevel = studentLevel;
    }

    @Override
    public String toString() {
        return " The student id is " + studentId + ",the student name is " + studentName + ",the student level is " + studentLevel;
    }

}
