import java.util.List;
import java.util.stream.Collectors;

public class StreamView {
    public static void main(String[] args) {
        courseFecilitator cf = new courseFecilitator();
        List<courseDetails> cd = cf.getCdList();
        List<studentCourse> cs = cf.getScList();
        cf.baseCourseDetails();
        cd.stream().filter(x->cs.stream()
                                .filter(y->y.getStudentId() != null && y.getStudentId().intValue()==3
                                && y.getCourseId()==x.getCourseId())
                .map(y ->y.getCourseId());


        cf.baseStudentCourse();
        List<courseDetails> cd1 = cs.stream()
                .filter(x -> x.getStudentId() != null && x.getStudentId().intValue() == 3)
                .flatMap(x -> cd.stream()
                        .filter(y -> y.getCourseId()!= null
                                && y.courseId.equals(x.courseId)))
                        .collect(Collectors.toList());
        System.out.println("Course Details matching student id=3");
        Double val = cd1.stream().map(x->x.getCourseFee()).reduce(0.0, Double::sum);
        System.out.println(val.toString());
    }
}
