package structs;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class ProfessorCourse {
    
    private CourseNode info;
    private ProfessorCourse next;

    public ProfessorCourse(CourseNode info) {
        this.info = info;
        this.next = null;
    }

    public CourseNode getInfo() {
        return info;
    }

    public ProfessorCourse getNext() {
        return next;
    }

    public void setInfo(CourseNode info) {
        this.info = info;
    }

    public void setNext(ProfessorCourse next) {
        this.next = next;
    }
    
}
