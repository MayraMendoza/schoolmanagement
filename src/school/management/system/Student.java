package school.management.system;

/**
 * Created by Mayra Mendoza on 4/14/2022
 * this class is responsible for keeping
 * track of students fees, name, grade and fees paid.
 *
 */

public class Student {

    // will be private because you want to protect from someone accessing id outside this class
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    // constructor is something that will create a new object

    /**
     * create a new student object by initializing.
     * Fees for every student is $30,000 per year
     * Fees paid initially is 0.
     * @param id id for the student: unique value.
     * @param name name of the student.
     * @param grade grade of the student
     */
    public Student( int id, String name, int grade){
        // fees paid is not passed as an argument

        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name, student's id.

    /**
     * used to update the students grade.
     * @param grade is the new grade of the student.
     */

    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * keep adding the fees to fees paid field.
     * Add the fees to the feeds paid.
     * The school is going to receive the funds.
     * @param fees the fees that the students paid
     */
    public void payFees(int fees){
        //feesPaid = feesPaid + fees;
        feesPaid += fees;
        // to update a variable in another class you will have to declare it as static.
        School.updateTotalMoneyEarned(getFeesPaid());




    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFess(){
        return feesTotal - feesPaid;
    }

    //control O -
    @Override
    public String toString() {
        return "Student's name: "+ name +" Total fees paid so far $"+ feesPaid;
    }


}
