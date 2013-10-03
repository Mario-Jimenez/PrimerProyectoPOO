package structs;

/**
 * Represents a node in the sublist of courses assigned to a semester
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class SemesterCourse {
    
    /**
     * The link to a node from the list CourseList
     * to access to the information of the course
     * that was assigned to the semester
     */
    private CourseNode course;
    /** Next node in the sublist */
    private SemesterCourse next;

    /**
     * Constructor
     * @param course a CourseNode instance to link
     * @see CourseNode
     */
    public SemesterCourse(CourseNode course) {
        this.course = course;
        this.next = null;
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
     * Setter
     * @param course a CourseNode instance
     * @see CourseNode
     */
    public void setCourse(CourseNode course) {
        this.course = course;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public SemesterCourse getNext() {
        return next;
    }

    /**
     * Setter
     * Assign the next node in the sublist
     * @param next a SemesterCourse instance
     * @see SemesterCourse
     */
    public void setNext(SemesterCourse next) {
        this.next = next;
    }
    
}
