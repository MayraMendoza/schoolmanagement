package school.management.system;

import java.util.List;

/**
 * a school can have many teacher and many students.
 * Implements teachers and students using an ArrayList.
 * created by Mayra Mendoza on 07/14/22
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent=0;

    }

    /**
     *
     * @return the list of teachers in the schoool.
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

//    /**
//     *
//     * @param teachers
//     */
//    public void addTeachers(Teacher teachers) {
//        this.teachers = teachers;
//    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
