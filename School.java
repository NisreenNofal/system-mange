package SchoolManagementSystem;

import java.util.ArrayList;

public class School {

    static Manger m = new Manger("Hamed", "2365774", "Gaza", 1023654789, "jhgdhghjg", 40000, "Hamed2", 1200);
    static ArrayList<Teacher> t = new ArrayList<>();
    static ArrayList<Student> st = new ArrayList<>();
    static ArrayList<Subject> sub = new ArrayList<>();

    public static void main(String[] args) {
        Teacher t1 = new Teacher(5, "Ali", "14875236", "Gaza", 1452369852, "fdgg", 1000, "Ali3");
        Teacher t2 = new Teacher(3, "Ahmed", "52348522", "Gaza", 230145987, "hduygj", 1000, "Ahmed4");
        Student s1 = new Student("mn2456", "omer", 9);
        Student s2 = new Student("mn2456", "samy", 9);
        Subject ma = new Subject("Mathmatic", st, t);
        Subject a = new Subject("arabic", st, t);
        t.add(t1);
        t.add(t2);
        st.add(s1);
        st.add(s2);
        sub.add(ma);
        sub.add(a);
    }

}
