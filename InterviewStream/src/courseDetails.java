
public class courseDetails {
    Number courseId;
    String courseName;
    Double courseFee;
    Number courseHours;

    public courseDetails(Number courseId, String courseName, Double courseFee, Number courseHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseHours = courseHours;
    }

    public courseDetails() {
    }

    public Number getCourseId() {
        return courseId;
    }

    public void setCourseId(Number courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(Double courseFee) {
        this.courseFee = courseFee;
    }

    public Number getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(Number courseHours) {
        this.courseHours = courseHours;
    }
}
