import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class courseFecilitator {
    List<courseDetails> cdList= new ArrayList<>(Arrays.asList(new courseDetails()));
    List<studentCourse> scList= new ArrayList<>(Arrays.asList(new studentCourse()));

    public courseFecilitator() {
    }

    public courseFecilitator(List<courseDetails> cdList, List<studentCourse> scList) {
        this.cdList = cdList;
        this.scList = scList;
    }

    public void baseCourseDetails() {
        this.cdList.add(new courseDetails(1,"Physics",1200.00,90));
        this.cdList.add(new courseDetails(2,"Chemistry",1100.00,90));
        this.cdList.add(new courseDetails(3,"Biology",900.00,90));
        this.cdList.add(new courseDetails(4,"Psychology",1200.00,90));
        this.cdList.add(new courseDetails(5,"Statistics",1100.00,90));
        this.cdList.add(new courseDetails(6,"Mathematics",900.00,90));
    }

    public void baseStudentCourse()
    {
        this.scList.add(new studentCourse(1,"Jack",1,0.0));
        this.scList.add(new studentCourse(1,"Jack",5,0.0));
        this.scList.add(new studentCourse(2,"Jack",2,0.0));
        this.scList.add(new studentCourse(2,"Jack",4,0.0));
        this.scList.add(new studentCourse(3,"Jack",6,0.0));
    }

    public List<courseDetails> getCdList() {
        return cdList;
    }

    public void setCdList(List<courseDetails> cdList) {
        this.cdList = cdList;
    }

    public List<studentCourse> getScList() {
        return scList;
    }

    public void setScList(List<studentCourse> scList) {
        this.scList = scList;
    }
}
