package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mayra Mendoza on 7/16/22
 */
public class Main {
    public static void main(String[] args) {
        //create a new teacher object
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher tom = new Teacher(3, "Tom",600);
        //create a list of teachers
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(tom);

        // create new student object
        Student tamasha = new Student(1,"Tamasha", 4);
        Student rakshith = new Student(2, "Raskshith", 12);
        Student rabbi = new Student(3,"Rabbi", 5 );

        // create a list of students
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        // create new school object
        // it will require you to pass alist of students and a list of students.

        School ghs= new School(teacherList, studentList);
        // add new teacher
        Teacher megan = new Teacher(6, "Megan", 900);
        ghs.addTeacher(megan);
        System.out.println("GHS has earned: $"+ ghs.getTotalMoneyEarned());

        // make tamasha pay school fees.
        tamasha.payFees(5000);
        System.out.println("GHS has earned: $"+ ghs.getTotalMoneyEarned());
        rakshith.payFees(6000);
        System.out.println("GHS has earned: $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY --------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has "+ ghs.getTotalMoneyEarned());
        tom.receiveSalary(tom.getSalary());
        System.out.println("GHS has spent for salary to " + tom.getName()
                +" and now has "+ ghs.getTotalMoneyEarned());

        // in order for the object to print out, you will need to override to string method in the objects.
        // class. WITHOUT THE OVERRIDE IT WILL RETURN THE MEMORY LOCATION.

        System.out.println(rakshith);
        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
    }
}
