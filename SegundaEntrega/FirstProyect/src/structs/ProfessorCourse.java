package structs;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class ProfessorCourse {
    
    private CourseNode course;
    private ProfessorCourse next;

    public ProfessorCourse(CourseNode course) {
        this.course = course;
        this.next = null;
    }

    public CourseNode getCourse() {
        return course;
    }

    public ProfessorCourse getNext() {
        return next;
    }

    public void setCourse(CourseNode course) {
        this.course = course;
    }

    public void setNext(ProfessorCourse next) {
        this.next = next;
    }
    
    
}
