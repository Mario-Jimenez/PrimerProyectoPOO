package structs;

import entities.Course;

/**
 *
 * @author Mario Jiménez & Osvaldo Barrantes
 */
public class CourseNode {
    
    private Course info;
    private int gruop;
    private CourseNode next;
    private ScheduleNode scheduleLink;

    public CourseNode(Course info) {
        this.info = info;
        this.next = null;
    }

    public Course getInfo() {
        return info;
    }

    public Course getCourse() {
        return info;
    }

    public int getGruop() {
        return gruop;
    }

    public ScheduleNode getScheduleLink() {
        return scheduleLink;
    }

    public CourseNode getNext() {
        return next;
    }

    public void setInfo(Course info) {
        this.info = info;
    }

    public void setCourse(Course course) {
        this.info = course;
    }

    public void setGruop(int gruop) {
        this.gruop = gruop;
    }

    public void setScheduleLink(ScheduleNode scheduleLink) {
        this.scheduleLink = scheduleLink;
    }

    public void setNext(CourseNode next) {
        this.next = next;
    }
    
}
