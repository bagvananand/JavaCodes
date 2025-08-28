public class studentCourse {
    Number studentId;
    String studentName;
    Number courseId;
    Double totalFee;

    public studentCourse(Number studentId, String studentName, Number courseId, Double totalFee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courseId = courseId;
        this.totalFee = totalFee;
    }

    public studentCourse() {
    }

    public Number getStudentId() {
        return studentId;
    }

    public void setStudentId(Number studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Number getCourseId() {
        return courseId;
    }

    public void setCourseId(Number courseId) {
        this.courseId = courseId;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }
}
