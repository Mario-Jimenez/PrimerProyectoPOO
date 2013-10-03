package structs;

import entities.Semester;

/**
 * Represents a node in the list SemesterList
 * @author Mario Jiménez & Osvaldo Barrantes
 * @version 1.0 September, 2013
 */
public class SemesterNode {
    
    /**
     * A Semester instance
     * Information of a semester entity
     * @see Semester
     */
    private Semester info;
    /** Next node in the list */
    private SemesterNode next;
    /**
     * A SemesterCourse instances
     * Head of a sublist containing the courses assigned
     * to a semester
     * @see SemesterCourse
     */
    private SemesterCourse coursesLink;

    /**
     * Constructor
     * @param info a Semester instance
     * @see Semester
     */
    public SemesterNode(Semester info) {
        this.info = info;
        this.next = null;
        this.coursesLink = null;
    }

    /**
     * Getter
     * @return a Semester instance
     * @see Semester
     */
    public Semester getInfo() {
        return info;
    }

    /**
     * Setter
     * @param info a Semester instance
     * @see Semester
     */
    public void setInfo(Semester info) {
        this.info = info;
    }

    /**
     * Getter
     * @return the next node in the list
     */
    public SemesterNode getNext() {
        return next;
    }

    /**
     * Setter
     * Assign the next node in the list
     * @param next a SemesterNode instance
     * @see SemesterNode
     */
    public void setNext(SemesterNode next) {
        this.next = next;
    }

    /**
     * Getter
     * @return the head of the sublist containing the courses assigned
     * to the semester
     */
    public SemesterCourse getCoursesLink() {
        return coursesLink;
    }

    /**
     * Setter
     * @param coursesLink a SemesterCourse instance
     * @see SemesterCourse
     */
    public void setCoursesLink(SemesterCourse coursesLink) {
        this.coursesLink = coursesLink;
    }
    
    /**
     * Assigns a new course to this semester
     * @param course a CourseNode instance
     * @see CourseNode
     */
    public void addCourse(CourseNode course) {
        SemesterCourse newNode = new SemesterCourse(course);
        if (coursesLink == null) {
            coursesLink = newNode;
        } else {
            newNode.setNext(coursesLink);
            coursesLink = newNode;
        }
    }
    
    /**
     * Removes a course previously assigned to this semester
     * @param courseID the id of the course to be removed
     */
    public void removeCourse(String courseID) {
        if (coursesLink.getCourse().getInfo().getId().compareTo(courseID) == 0) {
            coursesLink = coursesLink.getNext();
        } else {
            SemesterCourse temp = coursesLink;
            SemesterCourse prev = null;
            while (temp.getCourse().getInfo().getId().compareTo(courseID) != 0) {                
                prev = temp;
                temp = temp.getNext();
            }
            prev.setNext(temp.getNext());
        }
    }
    
}
