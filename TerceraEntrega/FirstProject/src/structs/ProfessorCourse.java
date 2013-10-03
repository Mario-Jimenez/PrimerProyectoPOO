package structs;

/**
 * Represents a node in the sublist of courses assigned to a professor
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class ProfessorCourse {
    
    /**
     * The link to a node from the list CourseList
     * to access to the information of the course
     * that was assigned to the professor
     */
    private CourseNode course;
    /** Next node in the sublist */
    private ProfessorCourse next;

    /**
     * Constructor
     * @param course a CourseNode instance to link
     * @see CourseNode
     */
    public ProfessorCourse(CourseNode course) {
        this.course = course;
        this.next = null;
    }

    public ProfessorCourse() {
    }
    
    /**
     * Getter
     * @return the CourseNode link
     * @see CourseNode
     */
    public CourseNode getCourse() {
        return course;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public ProfessorCourse getNext() {
        return next;
    }

    /**
     * Setter
     * @param course a CourseNode instance
     * @see CourseNode
     */
    public void setCourse(CourseNode course) {
        this.course = course;
    }

    /**
     * Setter
     * Assign the next node in the sublist
     * @param next a ProfessorCourse instance
     * @see ProfessorCourse
     */
    public void setNext(ProfessorCourse next) {
        this.next = next;
    }
    
}
