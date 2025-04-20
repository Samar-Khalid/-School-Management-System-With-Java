package package1;
import java.util.List;
public class Student extends Person {
     int id;
     String name;
     int grade;
     int feesPaid;
     int feesTotal;

//    public Student(int id, String name, int grade){
////        super (id , name , grade);
//        this.feesPaid=0;
//        this.feesTotal=30000;
//        this.id=id;
//        this.name=name;
//        this.grade=grade;
//
//    }

    public void setGrade(int grade){
        this.grade=grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
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
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}