package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

// the fees are not an argument
    public Student (int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to be altering the students name or id
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void updateFeesPaid(int fees) {
        feesPaid = feesPaid + fees;
    }

    //the school will receive the funds
    //add the frees to the fees paid
    //keep adding fees to tje feesPaid
    public void payFees(int fees) {

        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : " + name + " Total fees paid so far $" + feesPaid;
    }
}
