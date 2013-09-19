package structs;

import entities.Course;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class CourseNode {
    
    private Course info;
    private CourseNode next;

    public CourseNode(Course info) {
        this.info = info;
        this.next = null;
    }

    public Course getCourse() {
        return info;
    }

    public CourseNode getNext() {
        return next;
    }

    public void setCourse(Course course) {
        this.info = course;
    }

    public void setNext(CourseNode next) {
        this.next = next;
    }
    
}
